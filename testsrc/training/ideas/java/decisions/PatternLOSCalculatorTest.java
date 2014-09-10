package training.ideas.java.decisions;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnrkh on 9/5/2014.
 */
public class PatternLOSCalculatorTest {

    Map<String,Double> rate;
    String expectedFPLOS="";
    List<Double> lrv=new ArrayList<Double>(Arrays.asList(12.0,15.4,13.2,10.3,11.2,15.0,19.3));

    PatternLOSCalculator patternLOSCalculator = new PatternLOSCalculator(lrv);

    @Test
    public void rate_is_open_for_all_los_when_rateValue_greater_than_all_LRV(){
        double rate = 20.0;
       // rate = new TreeMap<String, Double>(){{put("RATE1",20.0);}};
        expectedFPLOS = "YYYYYYY";
        Assert.assertEquals(expectedFPLOS, patternLOSCalculator.calculate(rate));
    }
    @Test
    public void rate_is_close_for_all_los_when_rateValue_less_than_all_LRV(){

        double rate = 0.0;
        expectedFPLOS = "NNNNNNN";
        Assert.assertEquals(expectedFPLOS, patternLOSCalculator.calculate(rate));
    }
    @Test
    public void rate_is_Open_or_close_for_all_los_when_rateValue_in_between_LRV_values(){
        double rate = 10.0;
        expectedFPLOS = "NNNNNNN";
        Assert.assertEquals(expectedFPLOS, patternLOSCalculator.calculate(rate));
    }
    @Test
    public void get_output_for_rateSpectrum_Multiple_Dates_Rate_open_and_closed_for_all_los() throws ParseException {
        //input Rate
        rate = new TreeMap<String, Double>(){{put("RATE1",20.0);
            put("RATE2",100.0);
        }};

        // Setting Occupancy date
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        final Date d1 = df.parse("01-01-2014");
        final Date d2 = df.parse("02-01-2014");

        //Expected  output
        Map<Date,Map<String,DecisionPattern>> resultmap = new TreeMap<Date, Map<String, DecisionPattern>>();

        resultmap.put(d1, getStringDecisionPatternTreeMap("RATE1", "NNNNNNN",0 ,"RATE2", "YYYYYYY",1));
        resultmap.put(d2, getStringDecisionPatternTreeMap("RATE1", "NNNNNNN",0, "RATE2", "YYYYYYY",1));
        ArrayList<Double> lrvD1 = new ArrayList<Double>(Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
        ArrayList<Double> lrvD2 =new ArrayList<Double>(Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 80.0, 70.0));
        Assert.assertEquals(resultmap, getResults(d1, d2, lrvD1, lrvD2));
    }

    @Test
    public void get_output_for_rateSpectrum_Multiple_Dates_Rate_open_for_one_los() throws ParseException {
        //input Rate
        rate = new TreeMap<String, Double>(){{put("RATE1",20.0);
            put("RATE2",100.0);
        }};

        // Setting Occupancy date
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        final Date d1 = df.parse("01-01-2014");
        final Date d2 = df.parse("02-01-2014");

        //Expected  output
        Map<Date,Map<String,DecisionPattern>> resultmap = new TreeMap<Date, Map<String, DecisionPattern>>();

        resultmap.put(d1, getStringDecisionPatternTreeMap("RATE1", "YNNNNNN",1, "RATE2", "YNNNNNN",1));
        resultmap.put(d2, getStringDecisionPatternTreeMap("RATE1", "YNNNNNN",1, "RATE2", "YNNNNNN",1));
        ArrayList<Double> lrvD1 = new ArrayList<Double>(Arrays.asList(10.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0));
        ArrayList<Double> lrvD2 =new ArrayList<Double>(Arrays.asList(10.0, 250.0, 350.0, 450.0, 550.0, 850.0, 750.0));
        Assert.assertEquals(resultmap,getResults(d1,d2,lrvD1,lrvD2));
    }




    //Expected output method
    private TreeMap<String, DecisionPattern> getStringDecisionPatternTreeMap(String rateCode1,
                                                                    String fplosPattern1,
                                                                    int minlos1,
                                                                    String rateCode2,
                                                                    String fplosPattern2,
                                                                    int minlos2) {
        TreeMap<String, DecisionPattern> ratewiseDecision = new TreeMap<String, DecisionPattern>();
        ratewiseDecision.put(rateCode1,new DecisionPattern(fplosPattern1,minlos1));
        ratewiseDecision.put(rateCode2,new DecisionPattern(fplosPattern2,minlos2));
        return ratewiseDecision;
    }

    // Input method
    public Map<Date,Map<String,DecisionPattern>> getResults(
            final Date d1,final Date d2, final ArrayList<Double> arrD1,final ArrayList<Double> arrD2
    ) throws ParseException {
        Map<Date,ArrayList<Double>> dtLrv = new TreeMap<Date, ArrayList<Double>>(){{
            put(d1,arrD1);
            put(d2,arrD2);
        }};

        PatternLOSCalculator myLosPatternCalculator = new PatternLOSCalculator();
        Map<Date,Map<String,DecisionPattern>> resultMap = myLosPatternCalculator.getDecision(dtLrv, rate);
        return resultMap;
    }

    void assertEqualityOfDateMapStringDecisionPatternMap(Map<Date,Map<String,DecisionPattern>>expectedMap,
                                                            Map<Date,Map<String,DecisionPattern>> actualMap){
        Assert.assertTrue(expectedMap.keySet().equals(actualMap.keySet()));
        for(Date date: expectedMap.keySet()){
            assertEqualityOfStringDecisionPatternMap(expectedMap.get(date),actualMap.get(date));
        }
    }

    void  assertEqualityOfStringDecisionPatternMap(Map<String,DecisionPattern> expectedMap,Map<String,DecisionPattern> actualMap){
        Assert.assertTrue(expectedMap.keySet().equals(actualMap.keySet()));
        for (String rateCode:expectedMap.keySet()){
            Assert.assertEquals(expectedMap.get(rateCode),actualMap.get(rateCode));

        }
    }




}
