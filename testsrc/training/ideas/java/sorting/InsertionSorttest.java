package training.ideas.java.sorting;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by idnrkh on 8/6/2014.
 */
public class InsertionSorttest {
    @Test
    public void sortIntegerArrayInAsc_usingInsertionSort(){
        double numbers[]= {2,3,1,8,5,3,9,1};
        double expectedSortedNumbers[]={1,1,2,3,3,5,8,9};
        double sortedNumbers[]=InsertionSort.testInsertionSort(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }

}
