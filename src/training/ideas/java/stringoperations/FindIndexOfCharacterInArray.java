package training.ideas.java.stringoperations;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class FindIndexOfCharacterInArray {

    public static int getIndex(char[] array1, char ch) {

        for(int index=0;index<array1.length;index++)
        {
            if(array1[index]==ch)
                return index;
        }
        return -1;
    }
    public static int getIndex(char[] array1, char ch, int givenStartIndex) {


        for(int index=givenStartIndex;index<array1.length;index++)
        {
            if(array1[index]==ch){
                return index;
            }
        }
        return -1;
    }
    }
