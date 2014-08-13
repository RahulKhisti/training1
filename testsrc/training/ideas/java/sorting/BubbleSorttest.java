package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/5/2014.
 */
public class BubbleSorttest {
    @Test
    public void sortIntegerArrayInAsc(){
        double numbers[]= {2,3,1,8,5,3,9,1};
        double expectedSortedNumbers[]={1,1,2,3,3,5,8,9};
        double sortedNumbers[]=BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortDoubleArrayInAsc(){
        double numbers[]= {2.0,3.0,1.0};
        double expectedSortedNumbers[]={1.0,2.0,3.0};
        double sortedNumbers[]=BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortNegatIveintegerArrayInAsc(){
        double numbers[]= {-2,-3,-1};
        double expectedSortedNumbers[]={-3,-2,-1};
        double sortedNumbers[]=BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortTwoIntegerArrayInAsc(){
        double numbers[]= {100,200};
        double expectedSortedNumbers[]={100,200};
        double sortedNumbers[]=BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
    @Test
    public void sortTwoIntegerArrayInDesc(){
        double numbers[]= {100,200};
        double expectedSortedNumbers[]={200,100};
        double sortedNumbers[]=BubbleSort.desc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }
}
