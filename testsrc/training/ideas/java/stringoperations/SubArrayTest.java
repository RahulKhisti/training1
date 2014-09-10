package training.ideas.java.stringoperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class SubArrayTest {
    @Test
    public void testGetSubArray() {
        char[] array1={'d','e','f','a','b','c','d'};
        int endIndex= 1;
        char[] resultArray={'d'};

        Assert.assertArrayEquals(resultArray, SubArray.getSubArray(array1, endIndex));
    }
    @Test
    public void testGetSubArray_diffLength() {
        char[] array1={'d','e','f','a','b','c','d'};
        int endIndex=2;
        char[] resultArray={'d','e'};

        Assert.assertArrayEquals(resultArray, SubArray.getSubArray(array1, endIndex));
    }
    @Test
    public void testGetSubArray_start_end_Index() {
        char[] array1={'d','e','f','a','b','c','d'};
        int startIndex= 0;
        int endIndex= 2;
        char[] resultArray={'d','e','f'};

        Assert.assertArrayEquals(resultArray, SubArray.getSubArray(array1,startIndex, endIndex));
    }
    @Test
    public void testGetSubArray_diffLength_start_end_Index() {
        char[] array1={'d','e','f','a','b','c','d'};
        int startIndex= 1;
        int endIndex= 3;
        char[] resultArray={'e','f','a'};

        Assert.assertArrayEquals(resultArray, SubArray.getSubArray(array1,startIndex, endIndex));
    }
}
