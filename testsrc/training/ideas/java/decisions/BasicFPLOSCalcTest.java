package training.ideas.java.decisions;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnrkh on 9/5/2014.
 */
public class BasicFPLOSCalcTest {

    Map<String,Double> rate;
    String expectedFPLOS="";
    List<Double> lrv=new ArrayList<Double>(Arrays.asList(12.0,15.4,13.2,10.3,11.2,15.0,19.3));

    BasicFPLOSCalc fplos = new BasicFPLOSCalc(lrv);

    @Test
    public void rate_is_open_for_all_los_when_rateValue_greater_than_all_LRV(){

        rate = new TreeMap<String, Double>(){{put("RATE1",20.0);}};
        expectedFPLOS = "YYYYYYY";
        org.junit.Assert.assertEquals(expectedFPLOS,fplos.calculate(rate));
    }
    @Test
    public void rate_is_close_for_all_los_when_rateValue_less_than_all_LRV(){

        double rate = 0.0;
        expectedFPLOS = "NNNNNNN";
        org.junit.Assert.assertEquals(expectedFPLOS,fplos.calculate(rate));
    }
    @Test
    public void rate_is_Open_or_close_for_all_los_when_rateValue_in_between_LRV_values(){
        double rate = 10.0;
        expectedFPLOS = "NNNNNNN";
        org.junit.Assert.assertEquals(expectedFPLOS,fplos.calculate(rate));
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
        Map<Date,Map<String,String>> resultMap = new TreeMap<Date, Map<String, String>>();

        resultMap.put(d1, getStringStringTreeMap("RATE1", "NNNNNNN", "RATE2", "YYYYYYY"));
        resultMap.put(d2, getStringStringTreeMap("RATE1", "NNNNNNN", "RATE2", "YYYYYYY"));
        ArrayList<Double> lrvD1 = new ArrayList<Double>(Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
        ArrayList<Double> lrvD2 =new ArrayList<Double>(Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 80.0, 70.0));
        Assert.assertEquals(resultMap, getResults(d1, d2, lrvD1, lrvD2));
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
        Map<Date,Map<String,String>> resultMap = new TreeMap<Date, Map<String, String>>();

        resultMap.put(d1, getStringStringTreeMap("RATE1", "YNNNNNN", "RATE2", "YNNNNNN"));
        resultMap.put(d2, getStringStringTreeMap("RATE1", "YNNNNNN", "RATE2", "YNNNNNN"));
        ArrayList<Double> lrvD1 = new ArrayList<Double>(Arrays.asList(10.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0));
        ArrayList<Double> lrvD2 =new ArrayList<Double>(Arrays.asList(10.0, 250.0, 350.0, 450.0, 550.0, 850.0, 750.0));
        Assert.assertEquals(resultMap,getResults(d1,d2,lrvD1,lrvD2));
    }




    //Expected output method
    private TreeMap<String, String> getStringStringTreeMap(String rateCode1, String fplosPattern1, String rateCode2, String fplosPattern2) {
        TreeMap<String, String> rateWiseDecision = new TreeMap<String, String>();
        rateWiseDecision.put(rateCode1, fplosPattern1);
        rateWiseDecision.put(rateCode2, fplosPattern2);
        return rateWiseDecision;
    }

    // Input method
    public Map<Date,Map<String,String>> getResults(
            final Date d1,final Date d2, final ArrayList<Double> arrD1,final ArrayList<Double> arrD2
    ) throws ParseException {
        Map<Date,Map<String,String>> resultMap = new TreeMap<Date, Map<String, String>>();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Map<Date,ArrayList<Double>> dtLrv = new TreeMap<Date, ArrayList<Double>>(){{
            put(d1,arrD1);
            put(d2,arrD2);
        }};

        BasicFPLOSCalc myFplos = new BasicFPLOSCalc();
        resultMap = myFplos.getDecision(dtLrv, rate);
        return resultMap;
    }




}
