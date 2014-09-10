package training.ideas.java.decisions;

import java.util.*;


/**
 * Created by idnrkh on 9/5/2014.
 */
public class PatternLOSCalculator {

    private  List<Double> lrv;
    public PatternLOSCalculator(List<Double> lrv) {
        this.lrv=lrv;
    }

    public PatternLOSCalculator() {

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

    public TreeMap<String,DecisionPattern> calculate(Map<String, Double> rate) {
        TreeMap<String,DecisionPattern> resultMap = new TreeMap<String, DecisionPattern>();
        Set<String> keys = rate.keySet();
        for(String eachKey:keys){
            String fpLosPattern = calculate(rate.get(eachKey));
            resultMap.put(eachKey,new DecisionPattern(fpLosPattern,minLos(fpLosPattern)));
        }
        return resultMap;
    }


    public Map<Date, Map<String, DecisionPattern>> getDecision(Map<Date, ArrayList<Double>> dtLrv, Map<String, Double> rate) {

        Map<Date,Map<String,DecisionPattern>>decisionMap = new TreeMap<Date, Map<String, DecisionPattern>>();
        Set<Date> lstDate = dtLrv.keySet();
        for(Date dt:lstDate){
            lrv=dtLrv.get(dt);
            decisionMap.put(dt, calculate(rate));
        }
        return decisionMap;
    }

    private Integer minLos(String fpLosPattern){
        return fpLosPattern.indexOf("Y")+1;
    }
}

