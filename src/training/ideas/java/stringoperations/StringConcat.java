package training.ideas.java.stringoperations;

/**
 * Created by idnrkh on 8/18/2014.
 */
public  class StringConcat {




    public static char[] getConcat(char[] array1, char[] array2) {

        int array1length=array1.length;
        int both=array1.length+array2.length;
        char[] result =new char[both];

        for(int index=0;index<array1.length;index++)
        {
            result[index]=array1[index];
        }
        for(int index=0;index<array2.length;index++)
        {
            result[array1length+index]=array2[index];
            //array1length++;
            //System.out.println("Array after concatenation:"+result[index]);
        }
       return result;

    }
}
