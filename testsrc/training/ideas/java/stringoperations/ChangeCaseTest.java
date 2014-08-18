package training.ideas.java.stringoperations;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class ChangeCaseTest {

    @Test

    public void testUpperCaseConvertedArrayWithSingleCharinArray()
    {
        char[] array={'p'};
        char[] convertedArray={'P'};

        Assert.assertArrayEquals(convertedArray, ChangeCase.convertCharacterCase(array, ChangeCase.CaseConverter.Upper));
    }


}
