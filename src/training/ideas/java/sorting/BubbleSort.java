package training.ideas.java.sorting;

/**
 * Created by idnrkh on 8/5/2014.
 */
public class BubbleSort {

    private enum sortingOrder {ASC,DESC};
    public static double[] asc(double[] numbers) {

        sort(numbers,sortingOrder.ASC);
        return numbers;
    }

    private static boolean verifyOrder(double lhs,double rhs,sortingOrder order){
        if (order==sortingOrder.ASC){
            return lhs>rhs;
        }
        return lhs<rhs;
    }


    private static void sort(double[] numbers, sortingOrder order) {
        int arrayLength=numbers.length;
        while (arrayLength>=1)
        {

            for(int counter=0;counter<numbers.length-1;counter++){
                double temp=0;
                if (verifyOrder(numbers[counter],numbers[counter+1],order)){

                    temp= numbers[counter];
                    numbers[counter]=numbers[counter+1];
                    numbers[counter+1]=temp;
                }
            }
            arrayLength--;
        }
    }

    public static double[] desc(double[] numbers) {

        sort(numbers, sortingOrder.DESC);
        return numbers;

    }
}
