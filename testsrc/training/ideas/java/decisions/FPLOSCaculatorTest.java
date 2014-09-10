package training.ideas.java.decisions;
import java.sql.Date;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;


/**
 * Created by idnrkh on 9/4/2014.
 */
public class FPLOSCaculatorTest {

    @Test
    public void testAdvanced() {
        Map<Date, List<Double>> LRVMap = new HashMap<Date, List<Double>>();
        Map<Date, List<Double>> RateSpectrumMap = new HashMap<Date, List<Double>>();
        Set<Date> setOfOccupancyDates = new HashSet<Date>();

        setOfOccupancyDates.add(java.sql.Date.valueOf("2010-10-10"));
        setOfOccupancyDates.add(java.sql.Date.valueOf("2010-10-11"));
        setOfOccupancyDates.add(java.sql.Date.valueOf("2010-10-12"));

        RateSpectrumMap.put(java.sql.Date.valueOf("2010-10-10"), Arrays.asList(80.0, 90.0, 100.0, 110.0));
        RateSpectrumMap.put(java.sql.Date.valueOf("2010-10-11"), Arrays.asList(80.0, 90.0, 100.0, 110.0));
        RateSpectrumMap.put(java.sql.Date.valueOf("2010-10-12"), Arrays.asList(80.0, 90.0, 100.0, 110.0));

        LRVMap.put(java.sql.Date.valueOf("2010-10-10"), Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
        LRVMap.put(java.sql.Date.valueOf("2010-10-11"), Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
        LRVMap.put(java.sql.Date.valueOf("2010-10-12"), Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));

        Map<Date, Map<Double, String>> FPLOSDecision = new TreeMap<Date, Map<Double, String>>();
        FPLOSDecision = new FPLOSCalculaton().getFPLOSPattern(LRVMap, RateSpectrumMap, setOfOccupancyDates);
    }



    }
