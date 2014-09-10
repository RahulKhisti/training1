package training.ideas.java.arrays;


        import org.junit.Assert;
        import org.junit.Test;

/**
 * Created by idnrkh on 8/22/2014.
 */
public class MatrixAdditionTest {
    @Test
    public void addition_two_Matrix(){
        int [][]x={{1,2,3},{4,5,6}};
        int [][]y={{1,2,3},{4,5,6}};
        int [][]result={{2,4,6},{8,10,12}};
     Assert.assertArrayEquals(result, MatrixAddition.add(x, y));
    }
}
