package training.ideas.java.sorting;

/**
 * Created by idnrkh on 7/30/2014.
 */
public class Sorting {
    public static double[] bubbleSort(double[] numbers) {

        int arrayLength=numbers.length;
        while (arrayLength>=1)
        {

            for(int counter=0;counter<numbers.length-1;counter++){
                double temp=0;
                if (numbers[counter]>numbers[counter+1]){
                    temp= numbers[counter];
                    numbers[counter]=numbers[counter+1];
                    numbers[counter+1]=temp;

                }

            }
            arrayLength--;

        }
            return numbers;


    }

    public static double[] selectionSort(double[] numbers) {
        //double temp=0;
        int numberindex=0;

        for (int arrayCounter=0;arrayCounter<numbers.length;arrayCounter++){
             double temp=numbers[arrayCounter];
            numberindex=arrayCounter;


            for (int elementCounter=arrayCounter+1;elementCounter<numbers.length;elementCounter++){
                if (temp>=numbers[elementCounter]){
                    temp = numbers[elementCounter];
                    numberindex=elementCounter;

                }

            }

            double temp1 = numbers[numberindex];
            numbers[numberindex]=numbers[arrayCounter];
            numbers[arrayCounter] = temp1;
            double x = temp1;


        }

        return numbers;
    }
}
