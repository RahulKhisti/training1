package training.ideas.java.decisions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by idnrkh on 9/5/2014.
 */
public class BasicFPLOSCalc {

    private  List<Double> lrv;
    public BasicFPLOSCalc(List<Double> lrv) {
        this.lrv=lrv;
    }

    public BasicFPLOSCalc() {

    }


    public String calculate(Double rate) {
        Double sumLrv = 0.0;
        Double sumRate=0.0;
        String pattern="";
        for(Double eachLrv:lrv){
            sumLrv+=eachLrv;
            sumRate+=rate;
            if(sumRate>=sumLrv){
                pattern+="Y";
            }
            else{
                pattern+="N";
            }
        }
        return pattern;
    }

    public TreeMap<String,String> calculate(Map<String, Double> rate) {
        TreeMap<String,String> resultMap = new TreeMap<String, String>();
        Set<String> keys = rate.keySet();
        for(String eachKey:keys){
            resultMap.put(eachKey, calculate(rate.get(eachKey)));
        }

        return resultMap;
    }


    public Map<Date, Map<String, String>> getDecision(Map<Date, ArrayList<Double>> dtLrv, Map<String, Double> rate) {

        Map<Date,Map<String,String>>decisionMap = new TreeMap<Date, Map<String, String>>();

        Set<Date> lstDate = dtLrv.keySet();

        for(Date dt:lstDate){
            //lrv=dtLrv.get(dt);
            decisionMap.put(dt, calculate(rate));
        }
        return decisionMap;
    }
}

