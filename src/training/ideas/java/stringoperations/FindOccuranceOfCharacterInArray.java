package training.ideas.java.stringoperations;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class FindOccuranceOfCharacterInArray {
    public static int getOccurance(char[] array1, char ch) {

        int count=0;
        for(int index=0;index<array1.length; index++)
        {
            if(array1[index] == ch)
            {
                count++;
            }

        }
        return count;


    }

    public static int getOccurance(char[] array1, char ch, int givenStartIndex) {

        int count=0;
        for(int index=givenStartIndex;index<array1.length; index++)
        {
            if(array1[index] == ch)
            {
                count++;
            }

        }
        return count;
    }
}
