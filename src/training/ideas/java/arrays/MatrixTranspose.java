package training.ideas.java.arrays;

/**
 * Created by idnrkh on 8/25/2014.
 */
public class MatrixTranspose {
    public static Object[] getTranspose(int[][] x) {

        int[][] result = new int[x[0].length][x.length];

        for (int counter = 0; counter < x.length; counter++) {
            for (int counter1 = 0; counter1 < x[0].length; counter1++) {
                result[counter1][counter] = x[counter][counter1];
            }


        }
        return result;
    }
}
