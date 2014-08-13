package training.ideas.java.mathSeries;

/**
 * Created by idnrkh on 8/12/2014.
 */
public class Ceil {


    public static double getCeil(double givenNumber) {
        if (givenNumber*100 % 5 == 0) {
            return givenNumber;
        }
        return  (givenNumber*100+ 5-(givenNumber*100%5))/100;


    }
}
