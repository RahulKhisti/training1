package training.ideas.java.arrays;

/**
 * Created by idnrkh on 8/22/2014.
 */
public class MatrixAddition {

    public static Object[] add(int[][] x, int[][] y) {
        int[][]result=new int [x.length][x[0].length];
        for (int i=0; i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
               result[i][j]=x[i][j]+y[i][j];

            }
        }
        return result;
    }
}
