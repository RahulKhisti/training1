package training.ideas.java.arrays;

/**
 * Created by idnrkh on 8/25/2014.
 */
public class MatrixMultiplication {

    public static Object[] multiply(int[][] x, int[][] y) {

        int[][]result=new int [x.length][x[0].length];
        for (int i =0;i<x.length;i++)
        {
            for (int j = 0;j<x[0].length;j++)
            {
                int tempresult=0;
                for(int k=0;k<y[0].length;k++)
                {
                    tempresult+=(x[j][k]*y[k][i]);
                }
                result[j][i] =tempresult;
            }
        }
        return result;
    }

}
