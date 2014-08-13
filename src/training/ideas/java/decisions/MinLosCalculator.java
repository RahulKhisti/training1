package training.ideas.java.decisions;

/**
 * Created by idnrkh on 7/28/2014.
 */
public class MinLosCalculator {
    public static int minlos(String fplosPattern) {
       /* int counter=0;
        for (counter = 0; counter < fplosPattern.length; counter++) {

            if (fplosPattern[counter] == "Y") {
                return counter+1;
                }

        }

        return 0;*/

       return fplosPattern.toUpperCase().indexOf("Y")+1;

    }
}
