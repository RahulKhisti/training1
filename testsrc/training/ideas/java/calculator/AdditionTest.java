package training.ideas.java.calculator;


import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.decisions.FPLOSCalculator;

/**
 * Created by idnrkh on 7/21/2014.
 */
public class AdditionTest {

    @Test
    public void addTwoIntegers(){

        Assert.assertEquals(2+3,Addition.add(2,3),0.0);
    }

    @Test
    public void addTwoDouble(){
        Assert.assertEquals(10.0,Addition.add(6.0,4.0));
    }

  @Test
    public void addArrayDouble(){
        double arr[]={6.0,7.0,8.0};
        Assert.assertEquals(21.0,Addition.add(arr));
    }


    //Variable argument list

    @Test
    public void add4variablearguments(){
        Assert.assertEquals(21,Addition.add(6,4,10,1),0.0);
    }
    @Test
    public void add5variablearguments(){
        Assert.assertEquals(21,Addition.add(6,4,6,4,1),0.0);
    }
    @Test
    public void add1variablearguments(){
        Assert.assertEquals(21,Addition.add(21),0.0);
    }

    /*@Test
    public void verifyFpLOS(){
        int rate = 150;
    /*int los[]={1,2,3,4,5,6,7,8};
        double lrv[] = {100.0, 150.0, 200.0, 300.0, 150.0, 200.0, 600.0, 100.0};
        Assert.assertEquals("YYYNNNNN", FPLOSCalculator.fplos(rate, lrv));
    }*/

// getting to state where we are
// addition of all double numbers with the help of array.


}
