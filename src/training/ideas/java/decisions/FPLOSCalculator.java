package training.ideas.java.decisions;

import java.util.Arrays;

/**
 * Created by idnrkh on 7/23/2014.
 */
public class FPLOSCalculator {


    public static String fplos(double rateValue, double...lrv) {
        String pattern="";

        double Avglrv = 0;
        int los =1;
        double sumOfLrv = 0;
        //int los =1;
        int day=0;
        for (double lrvValueForaDay: lrv ){
             sumOfLrv += lrvValueForaDay;
                if (sumOfLrv / los <= rateValue) {
                    pattern+= "Y";
                } else {
                    pattern+= "N";
                }
                los++;

        }

        return pattern;

    }

    public static String[] fplos( double[] lrv,double... rateSpectrum) {

        String pattern[]= new String[rateSpectrum.length];
        Arrays.fill(pattern, "");

       int day= 0;
        for (double rateValue:rateSpectrum) {
            /*double sumOfLrv = 0;
            int los =1;

            for (double lrvValueForaDay : lrv) {

                sumOfLrv += lrvValueForaDay;
                if (sumOfLrv / los <= rateValue) {
                    pattern[day] += "Y";
                } else {
                    pattern[day] += "N";
                }
                los++;

            }
            day++;*/

          pattern[day++] = fplos(rateValue,lrv);
        }

        return pattern;

    }
}
