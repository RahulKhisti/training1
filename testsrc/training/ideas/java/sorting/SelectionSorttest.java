package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/5/2014.
 */
public class SelectionSorttest {
    @Test
    public void sortIntegerArrayInAsc_usingSelectionSort(){
        double numbers[]= {2,3,1,8,5,3,9,1};
        double expectedSortedNumbers[]={1,1,2,3,3,5,8,9};
        double sortedNumbers[]=SelectionSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortNegativeIntegerArrayInAsc_usingSelectionSort(){
        double numbers[]= {-2,-3,-1};
        double expectedSortedNumbers[]={-3,-2,-1};
        double sortedNumbers[]=SelectionSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortNegative_PositiveIntegerArrayInAsc_usingSelectionSort(){
        double numbers[]= {-2,-3,-1,1,0,4,3};
        double expectedSortedNumbers[]={-3,-2,-1,0,1,3,4};
        double sortedNumbers[]=SelectionSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortNegative_PositiveIntegerArrayInDesc_usingSelectionSort(){
        double numbers[]= {-2,4,3};
        double expectedSortedNumbers[]={-2,3,4};
        double sortedNumbers[]=SelectionSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
}
