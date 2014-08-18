package training.ideas.java.stringoperations;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;


/**
 * Created by idnrkh on 8/18/2014.
 */
public class ChangeCase {
    public  enum CaseConverter {
        Upper, Lower;
    }



        public static char[] convertCharacterCase(char[] array, CaseConverter input) {


        for(int counter =0; counter <array.length; counter++)

        {
            if(input==CaseConverter.Upper)
            {
                char ch=array[counter];
                array[counter]=toUpperCase(ch);
            }
            if(input==CaseConverter.Lower)
            {
                char ch=array[counter];
                array[counter]=toLowerCase(ch);
            }
        }

        return array;
    }


}
