package training.ideas.java.stringoperations;

/**
 * Created by idnrkh on 8/18/2014.
 */
public class SubArray {

    public static char[] getSubArray(char[] array1, int endIndex) {
        char[] resultArray=new char[endIndex];
        if (endIndex>array1.length)
        {
            return array1;
        }
        for(int index=0;index<=endIndex-1;index++)
        {
            resultArray[index]=array1[index];
        }
        return resultArray;
    }

    public static char[] getSubArray(char[] array1, int startIndex, int endIndex) {
        int resultarrayLength=(endIndex-startIndex)+1;
        char[] resultArray=new char[resultarrayLength];

        int resultarrayIndex=0;
        for(int index=startIndex;index<=endIndex;index++)
        {

            resultArray[resultarrayIndex]=array1[index];
            resultarrayIndex++;
        }
        return resultArray;

    }
}
