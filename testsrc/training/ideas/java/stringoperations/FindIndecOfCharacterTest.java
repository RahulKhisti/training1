package training.ideas.java.stringoperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class FindIndecOfCharacterTest {

    @Test
    public void testFindIndexOfCharacterinArray() {
        char[] array1={'d','e','f','a','b','c','d'};
        char ch = 'b';
        int expectedIndex= 4;

        Assert.assertEquals(expectedIndex, FindIndexOfCharacterInArray.getIndex(array1, ch));
    }

    @Test
    public void testFindIndexOfCharacterinArray_characternotfound() {
        char[] array1={'d','e','f','a','b','c','d'};
        char ch = 'X';
        int expectedIndex= -1;

        Assert.assertEquals(expectedIndex, FindIndexOfCharacterInArray.getIndex(array1, ch));
    }
    @Test
    public void testFindIndexOfCharacterinArray_Case() {
        char[] array1={'d','e','f','a','b','c','d'};
        char ch = 'E';
        int expectedIndex= -1;

        Assert.assertEquals(expectedIndex, FindIndexOfCharacterInArray.getIndex(array1, ch));
    }
    @Test
    public void testFindIndexOfCharacterinArray_givenStartIndex() {
        char[] array1={'d','e','f','a','b','c','d','d','f','b'};
        char ch = 'b';
        int givenStartIndex= 5;
        int expectedIndex= 9;

        Assert.assertEquals(expectedIndex, FindIndexOfCharacterInArray.getIndex(array1, ch,givenStartIndex));
    }

    @Test
    public void testFindIndexOfCharacterinArray_GivenStartIndex_indexnotFound() {
        char[] array1={'d','e','f','a','b','c','d','d','f','b'};
        char ch = 'x';
        int givenStartIndex= 5;
        int expectedIndex= -1;

        Assert.assertEquals(expectedIndex, FindIndexOfCharacterInArray.getIndex(array1,ch,givenStartIndex));
    }
}
