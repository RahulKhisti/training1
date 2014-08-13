package training.ideas.java.mathSeries;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by idnrkh on 8/12/2014.
 */
public class FindAngleTest {


    @Test
    public  void  findAngleBetweenHourAndMinute()
    {


        int expected = 90;

        Assert.assertEquals(expected,FindAngle.getAngleBetweenHourMin(3,00), 0.0);

    }


    @Test
    public  void  findAngleBetweenHourAndMinutePass()
    {


        double expected = 126.5;

        Assert.assertEquals(expected,FindAngle.getAngleBetweenHourMin(12,23),0.0);

    }



}




