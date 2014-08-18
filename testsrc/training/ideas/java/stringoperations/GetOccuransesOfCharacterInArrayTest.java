package training.ideas.java.stringoperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class GetOccuransesOfCharacterInArrayTest {

    @Test
    public void testFindOccurancesOfCharacterInArray() {
        char[] array1={'d','e','f','a','b','c','d'};
        char ch = 'b';
        int expectedOccurance= 1;

        Assert.assertEquals(expectedOccurance, FindOccuranceOfCharacterInArray.getOccurance(array1, ch));
    }
    @Test
    public void testFindIndexOfCharacterinArray_characternotfound() {
        char[] array1={'d','e','f','a','b','c','d'};
        char ch = 'X';
        int expectedOccurance= 0;

        Assert.assertEquals(expectedOccurance, FindOccuranceOfCharacterInArray.getOccurance(array1, ch));
    }
    @Test
    public void testFindIndexOfCharacterinArray_Case() {
        char[] array1={'d','e','f','a','b','c','d'};
        char ch = 'E';
        int expectedOccurance= 0;

        Assert.assertEquals(expectedOccurance, FindOccuranceOfCharacterInArray.getOccurance(array1, ch));
    }
    @Test
    public void testFindIndexOfCharacterinArray_givenStartIndex() {
        char[] array1={'d','e','f','a','b','c','d','d','f','b'};
        char ch = 'b';
        int givenStartIndex= 5;
        int expectedOccurance= 1;

        Assert.assertEquals(expectedOccurance, FindOccuranceOfCharacterInArray.getOccurance(array1, ch, givenStartIndex));
    }

    @Test
    public void testFindIndexOfCharacterinArray_GivenStartIndex_indexnotFound() {
        char[] array1={'d','e','f','a','b','c','d','d','f','b'};
        char ch = 'x';
        int givenStartIndex= 5;
        int expectedOccurance= 0;

        Assert.assertEquals(expectedOccurance, FindOccuranceOfCharacterInArray.getOccurance(array1, ch, givenStartIndex));
    }
}
