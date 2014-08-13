package training.ideas.java.decisions;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 7/28/2014.
 */
public class MinLosCalculatortest {

    @Test
    public void minlos(){
        //String fplosPattern = "NNYYYNNY";
       Assert.assertEquals(3,MinLosCalculator.minlos("NNYYYNNY"));
    }
    @Test
    public void minlosWithAllNo(){
        //String fplosPattern[] = {"N","N","N","N","N","N","N","N"};
        Assert.assertEquals(0,MinLosCalculator.minlos("NNNNNNNN"));
    }
    @Test
    public void minlosWithFirstY(){
       // String fplosPattern[] = {"NNNNNNNN"};
        Assert.assertEquals(1,MinLosCalculator.minlos("YNNNNNNN"));
    }
}
