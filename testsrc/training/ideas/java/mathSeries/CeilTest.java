package training.ideas.java.mathSeries;

import org.junit.Test;
import org.junit.Assert;



/**
 * Created by idnrkh on 8/12/2014.
 */
public class CeilTest {

    @Test
    public  void  test_Ceil() {
        double givenNumber = 33.56;
        Assert.assertEquals(33.60,Ceil.getCeil(givenNumber),0.0);
    }

    @Test
    public  void  test_Ceil_for_5() {
        double givenNumber = 33.50;
        Assert.assertEquals(33.50,Ceil.getCeil(givenNumber),0.0);
    }

    @Test
    public  void  test_Ceil_for_0() {
        double givenNumber = 0;
        Assert.assertEquals(0, Ceil.getCeil(givenNumber), 0.0);
    }
    @Test
    public  void  test_Ceil_for_wholeNumber() {
        double givenNumber = 4;
        Assert.assertEquals(4, Ceil.getCeil(givenNumber), 0.0);
    }

    }

