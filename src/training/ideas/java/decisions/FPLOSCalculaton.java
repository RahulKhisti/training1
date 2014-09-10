package training.ideas.java.decisions;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Created by idnrkh on 9/4/2014.
 */
public class FPLOSCalculaton {

    private void fetchFPLOSPatternGivenLRVandRate(List<Double> rateByOccupancyDate,List<Double> LRVbyOccupancyDate) {

        for(Double rate : rateByOccupancyDate)
        {
            System.out.print(" "+rate);

            double sumLRV = 0;
            int LOScount=1;
            for(Double currentLRV : LRVbyOccupancyDate)
            {
                sumLRV = sumLRV + currentLRV;

                if((rate * LOScount) >= sumLRV)
                    System.out.print("Y");
                else
                    System.out.print("N");
                LOScount++;
            }
        }
        System.out.println();
    }

    public Map<Date, Map<Double, String>> getFPLOSPattern (       Map<Date, List<Double>> LRVMap,
                                                                  Map<Date, List<Double>> rateMap,
                                                                  Set<Date> setOfOccupancyDate) {

        System.out.println(" OccupancyDate        CurrentRate        FPLOS Pattern");
        for(Date occupancyDate : setOfOccupancyDate)
        {
            System.out.print(occupancyDate + "   \t");
            List<Double> LRVforOccDate = LRVMap.get(occupancyDate);
            List<Double> rate = rateMap.get(occupancyDate);
            this.fetchFPLOSPatternGivenLRVandRate(rate, LRVforOccDate);
        }

        Map<Date, Map<Double,String>> FPLOSDecision = new TreeMap<Date,Map<Double,String>>();
        return FPLOSDecision;
    }
}




