package training.ideas.java.sorting;

/**
 * Created by idnrkh on 8/6/2014.
 */
public class InsertionSort {
    public static double [] testInsertionSort( double numbers[]) {
        for (int counter1 =1; counter1 < numbers.length; counter1++) {
            double  hold = numbers[counter1];
            int counter2 = counter1;
            for (; counter2 > 0; counter2--) {

                if (hold < numbers[counter2 - 1]) {
                    numbers[counter2] = numbers[counter2 - 1];

                } else {

                    break;
                }



            }

numbers[counter2]=hold;
        }
        return numbers;
    }
}