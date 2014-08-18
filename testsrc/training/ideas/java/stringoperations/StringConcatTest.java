package training.ideas.java.stringoperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class StringConcatTest {
    @Test
    public void testCharacterArrayConcat() {
        char[] array1={'d','e','f'};
        char[] array2={'a','b','c'};
        char[] output={'d','e','f','a','b','c'};
        Assert.assertArrayEquals(output, StringConcat.getConcat(array1,array2));
    }
}
