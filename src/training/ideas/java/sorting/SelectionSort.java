package training.ideas.java.sorting;

/**
 * Created by idnrkh on 8/5/2014.
 */
public class SelectionSort {
    private enum sortingOrder {ASC,DESC};

    public static double[] asc(double[] numbers) {
        //double temp=0;
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
        int numberindex=0;

        for (int arrayCounter=0;arrayCounter<numbers.length;arrayCounter++){
            double minNumber=numbers[arrayCounter];
            numberindex=arrayCounter;


            for (int elementCounter=arrayCounter+1;elementCounter<numbers.length;elementCounter++){
                if (verifyOrder(minNumber,numbers[elementCounter],order)){
                    minNumber = numbers[elementCounter];
                    numberindex=elementCounter;

                }

            }

            double temp1 = numbers[numberindex];
            numbers[numberindex]=numbers[arrayCounter];
            numbers[arrayCounter] = temp1;
            double x = temp1;


        }
    }

    public static double[] desc(double[] numbers) {
        //double temp=0;
        sort(numbers,sortingOrder.DESC);

        return numbers;
    }

}
