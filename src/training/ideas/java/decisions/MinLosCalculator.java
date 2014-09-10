package training.ideas.java.decisions;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by idnrkh on 7/28/2014.
 */
public class MinLosCalculator {

        public  int minlos( String fplosPattern) {
       /* int counter=0;
        for (counter = 0; counter < fplosPattern.length; counter++) {

            if (fplosPattern[counter] == "Y") {
                return counter+1;
                }

        }

        return 0;*/


       if(fplosPattern != null)
       return fplosPattern.toUpperCase().indexOf("Y")+1;
       else
       return -1;
    }

    public Map<Date, Map<String, Integer>> minlos( TreeMap<Date,TreeMap<String, String>> rateWisePattern) {
        Map<Date,Map<String,Integer>>decisionMap = new TreeMap<Date, Map<String, Integer>>();

        Set<Date> occupancyDate = rateWisePattern.keySet();

        for (Date eachDate:occupancyDate){
            Map<String,String>rateCode=new TreeMap<String, String>();
            rateCode=rateWisePattern.get(eachDate);
            decisionMap.put(eachDate,calculate(rateCode));


        }
        return  decisionMap;
    }

    private Map<String, Integer> calculate(Map<String, String> rateCode) {

        TreeMap<String,Integer> resultMap = new TreeMap<String, Integer>();
        Set<String> keys = rateCode.keySet();
        for(String eachKey:keys){
            resultMap.put(eachKey, minlos(rateCode.get(eachKey)));
        }

        return resultMap;
    }
    }

