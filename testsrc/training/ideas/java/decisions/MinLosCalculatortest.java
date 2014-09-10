package training.ideas.java.decisions;
import junit.framework.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnrkh on 7/28/2014.
 */
public class MinLosCalculatortest {
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    TreeMap<Date,TreeMap<String,String>> rateWisePattern;



    @Test
    public void minlos_with_Y_Inbetween() throws ParseException {

        final Date d1 = df.parse("01-01-2014");
        final Date d2 = df.parse("02-01-2014");
        //String fplosPattern = "NNYYYNNY";

        rateWisePattern=new TreeMap<Date, TreeMap<String,String>>()
            {{
                put(d1,new TreeMap<String,String>()
               {{
                   put("RATE1","NNYYYNNY");
                    put("RATE2","NNNNNNNN");
                }}
                );
                put(d2, new TreeMap<String, String>(){{
                    put("RATE1","NYYYYNNY");
                    put("RATE2","YNNNNNNN");
                }});
            }};


        Map<Date,Map<String,Integer>> resultMap = new TreeMap<Date, Map<String, Integer>>();
        resultMap.put(d1,getMinlosStringInteger("RATE1",3,"RATE2",0));
        resultMap.put(d2,getMinlosStringInteger("RATE1",2,"RATE2",1));

       // Set<Date> occupancyDates=  new HashSet<Date>();
        //occupancyDates.add(d1);
        //occupancyDates.add(d2);

        MinLosCalculator minLos=new MinLosCalculator();
        org.junit.Assert.assertEquals(resultMap,  minLos.minlos(rateWisePattern ));


       //Assert.assertEquals(3, new MinLosCalculator("NNYYYNNY").minlos());

    }

    /*private Map<Date, Map<String, Integer>> getResults( TreeMap<Date,TreeMap<String,String>> rateWisePattern) {
        MinLosCalculator minLos=new MinLosCalculator();
        Map<Date,Map<String,Integer>> outputMap = minLos.minlos(rateWisePattern);
        return outputMap;
    }*/

    private Map<String,Integer> getMinlosStringInteger(String rateCode1, Integer expectedMinLos1 , String rateCode2, Integer expectedMinLos2) {
        TreeMap<String, Integer> rateWiseDecision = new TreeMap<String, Integer>();
        rateWiseDecision.put(rateCode1, expectedMinLos1);
        rateWiseDecision.put(rateCode2, expectedMinLos2);
        return rateWiseDecision;

    }

    @Test
    public void minlosWithAllNo(){
        //String fplosPattern[] = {"N","N","N","N","N","N","N","N"};
        String fplosPattern = "NNNNNNNN";
        MinLosCalculator myminlos=new MinLosCalculator();
        Assert.assertEquals(0,myminlos.minlos(fplosPattern));
    }
    @Test
    public void minlosWithFirstY(){
        //S String fplosPattern[] = {"NNNNNNNN"};
        String fplosPattern = "YNNNNNNN";
        MinLosCalculator myminlos=new MinLosCalculator();
        Assert.assertEquals(1, myminlos.minlos(fplosPattern));
    }
}
