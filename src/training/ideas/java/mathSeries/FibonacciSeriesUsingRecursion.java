package training.ideas.java.mathSeries;

/**
 * Created by idnrkh on 8/6/2014.
 */
public class FibonacciSeriesUsingRecursion {
    public static int[] getFibonacciSeries(int lengthOfFibonacciSeries) {

        int fibonacciSeries[] = new int[lengthOfFibonacciSeries];

        for (int counter = 0; counter < fibonacciSeries.length; counter++) {
            fibonacciSeries[counter] = getFibonacciSerieByrecurssion(counter);
        }
        return fibonacciSeries;
    }


    private static int getFibonacciSerieByrecurssion(int counter) {
        if (counter==0){
            return 0;
        }
        else if (counter==1){
            return 1;
        }
        else {

            return getFibonacciSerieByrecurssion(counter-1)+getFibonacciSerieByrecurssion(counter-2);
        }

    }
}
