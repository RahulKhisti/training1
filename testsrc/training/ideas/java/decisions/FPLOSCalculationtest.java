package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 7/24/2014.
 */
public class FPLOSCalculationtest {

   /* @Test
            public void fplostest(){


    double rate = 100;
    /*int los[]={1,2,3,4,5,6,7,8};
    double lrv[] = {100.0, 150.0, 200.0, 300.0, 150.0, 200.0, 600.0, 100.0};
    Assert.assertEquals("YYYNNNNN",FPLOSCalculator.fplos(rate,lrv));

    }*/

    @Test
    public void fplostest_For_MultipleRates(){


        double rateSpectrum[] = {100.0, 150.0, 200.0, 300.0, 150.0, 200.0, 600.0, 100.0};
        double lrv[] = {100.0, 0.0, 200.0, 500.0, 450.5, 600.0, 600.0, 100.0};

       // Assert.assertEquals("YYYNNNNN",FPLOSCalculator.fplosForRateSpectrum(rateSpectrum,lrv));
        String[] resultPattern = FPLOSCalculator.fplos(lrv,rateSpectrum);
        String[] espectedPattern= {"YYYNNNNN","YYYNNNNN","YYYYNNNN","YYYYYNNN","YYYNNNNN","YYYYNNNN","YYYYYYYY","YYYNNNNN"};

        for(int counter = 0; counter < espectedPattern.length; counter++)
        {
           Assert.assertEquals(espectedPattern[counter],resultPattern[counter]);
        }


    }
    @Test

    public void fplostest_For_TwoRates(){


        double rateSpectrum[] = {100.0, 150.0};
        double lrv[] = {100.0, 0.0, 200.0, 500.0, 450.5, 600.0, 600.0, 100.0};

        // Assert.assertEquals("YYYNNNNN",FPLOSCalculator.fplosForRateSpectrum(rateSpectrum,lrv));
        String[] resultPattern = FPLOSCalculator.fplos(lrv,rateSpectrum);
        String[] espectedPattern= {"YYYNNNNN","YYYNNNNN"};

        for(int counter = 0; counter < espectedPattern.length; counter++)
        {
            Assert.assertEquals(espectedPattern[counter],resultPattern[counter]);
        }


    }



}



