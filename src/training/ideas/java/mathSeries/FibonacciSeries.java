package training.ideas.java.mathSeries;

/**
 * Created by idnrkh on 8/5/2014.
 */
public class FibonacciSeries {


    public static int[] getFibonacciSeries(int lengthOfFibonacciSeries) {

        int fibonacciSeries[] = new int[lengthOfFibonacciSeries];

        fibonacciSeries[0]=0;
        if (lengthOfFibonacciSeries == 1) {
           return fibonacciSeries;
        }

        else if (lengthOfFibonacciSeries == 2) {
            fibonacciSeries[1]=1;
            return fibonacciSeries;
        }
        else
        {
            fibonacciSeries[0]=0;
            fibonacciSeries[1]=1;

            for(int counter=2;counter<fibonacciSeries.length;counter++) {

                fibonacciSeries[counter]= fibonacciSeries[counter-1]+ fibonacciSeries[counter-2];
            }
            return fibonacciSeries;
        }


    }

}

