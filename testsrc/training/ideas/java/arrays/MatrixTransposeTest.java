package training.ideas.java.arrays;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by idnrkh on 8/25/2014.
 */
public class MatrixTransposeTest {

    @Test
    public void addition_two_Matrix(){
        int [][]x={{1,2,3},{4,5,6}};
        //int [][]y={{1,2,3},{4,5,6}};
        int [][]result={{1,4},{2,5},{3,6}};
        Assert.assertArrayEquals(result, MatrixTranspose.getTranspose(x));
    }
}
