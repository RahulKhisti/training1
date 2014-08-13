package training.ideas.java.mathSeries;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/11/2014.
 */
public class FissBuzzTest {
    @Test
    public void testFissBuzz(){
        int givenNumber=15;
        String outPut="12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
        Assert.assertEquals("Does Not Match ",outPut, FissBuzz.getFissBuzz(givenNumber));

    }
    @Test
    public void testFissBuzz_for_2(){
        int givenNumber=2;
        String outPut="12";
        Assert.assertEquals("Does Not Match ",outPut, FissBuzz.getFissBuzz(givenNumber));

    }
    @Test
    public void testFissBuzz_for_1(){
        int givenNumber=1;
        String outPut="1";
        Assert.assertEquals("Does Not Match ",outPut, FissBuzz.getFissBuzz(givenNumber));

    }

}
