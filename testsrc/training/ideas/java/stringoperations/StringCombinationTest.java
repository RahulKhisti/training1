package training.ideas.java.stringoperations;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by idnrkh on 8/14/2014.
 */
public class StringCombinationTest {
    @Test
    public void teststringCombination() {
        String givenString = "ABC";
        String[]  outPut  = {"ABC","BCA","CAB"} ;
        Assert.assertArrayEquals(outPut, StringCombination.getCombinations(givenString));
    }
}
