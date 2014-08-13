package training.ideas.java.calculator;

/**
 * Created by idnrkh on 7/21/2014.
 */
public class Addition {



    public static double add(double... numbers) {
        double total=0;
        for (double number : numbers){
            total +=number;
        }
        return total;
    }


    


}
