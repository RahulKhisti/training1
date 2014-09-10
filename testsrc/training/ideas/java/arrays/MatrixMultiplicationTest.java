package training.ideas.java.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/25/2014.
 */
public class MatrixMultiplicationTest {

    @Test
    public void multiply_two_Matrix(){
        int [][]x={{1,3,2},{2,4,6}};
        int [][]y={{5,7},{6,8},{5,3}};
        int [][]result={{23,31},{34,46}};
        Assert.assertArrayEquals(result, MatrixMultiplication.multiply(x, y));
    }
}
