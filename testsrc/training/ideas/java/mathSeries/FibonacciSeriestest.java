package training.ideas.java.mathSeries;
import org.junit.Assert;
import org.junit.Test;
/**

/**
 * Created by idnrkh on 8/5/2014.
 */
public class FibonacciSeriestest {
    @Test
    public void test_FibonacciSeries_For_FourElements() {
        int lengthOfFibonacciSeries = 4;
        int[] expectedFibonacciSeries = {0, 1, 1, 2};

        Assert.assertArrayEquals(expectedFibonacciSeries, FibonacciSeries.getFibonacciSeries(lengthOfFibonacciSeries));
    }

    @Test
    public void test_FibonacciSeries_For_OneElement() {
        int lengthOfFibonacciSeries = 1;
        int[] expectedFibonacciSeries = {0};

        Assert.assertArrayEquals(expectedFibonacciSeries, FibonacciSeries.getFibonacciSeries(lengthOfFibonacciSeries));
    }

    @Test
    public void test_FibonacciSeries_For_TwoElements() {
        int lengthOfFibonacciSeries = 2;
        int[] expectedFibonacciSeries = {0, 1};

        Assert.assertArrayEquals(expectedFibonacciSeries, FibonacciSeries.getFibonacciSeries(lengthOfFibonacciSeries));
    }

    @Test
    public void test_FibonacciSeries_For_FiveElements() {
        int lengthOfFibonacciSeries = 5;
        int[] expectedFibonacciSeries = {0, 1, 1, 2, 3};

        Assert.assertArrayEquals(expectedFibonacciSeries, FibonacciSeries.getFibonacciSeries(lengthOfFibonacciSeries));
    }

    @Test
    public void test_FibonacciSeries_For_FourElements_rcursion() {
        int lengthOfFibonacciSeries = 4;
        int[] expectedFibonacciSeries = {0, 1, 1, 2};

        Assert.assertArrayEquals(expectedFibonacciSeries, FibonacciSeriesUsingRecursionArray.getFibonacciSeries(lengthOfFibonacciSeries));

    }
}
