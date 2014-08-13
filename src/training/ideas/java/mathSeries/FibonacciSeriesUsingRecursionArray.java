package training.ideas.java.mathSeries;

/**
 * Created by idnrkh on 8/9/2014.
 */
public class FibonacciSeriesUsingRecursionArray {
        public static int[] getFibonacciSeries(int lengthOfFibonacciSeries) {

            int fibonacciSeries[] = new int[lengthOfFibonacciSeries];

           /* for (int counter = 0; counter < fibonacciSeries.length; counter++) {
                fibonacciSeries[counter] = getFibonacciSerieByrecurssion(counter, fibonacciSeries);
            }*/
            getFibonacciSerieByrecurssion(lengthOfFibonacciSeries, fibonacciSeries);
            return fibonacciSeries;
        }


        private static int[]  getFibonacciSerieByrecurssion(int counter,int [] fibonacciSeries) {
             if (counter==1){
                fibonacciSeries[0]=0 ;
                return fibonacciSeries;
            }
            else if (counter==2){
                fibonacciSeries[0]=0 ;
                fibonacciSeries[1]=1;
                return fibonacciSeries;
            }


             getFibonacciSerieByrecurssion(counter-1, fibonacciSeries);

            fibonacciSeries[counter-1]=fibonacciSeries[counter-2]+fibonacciSeries[counter-3];
            return fibonacciSeries;

        }
    }


