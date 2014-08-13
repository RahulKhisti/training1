package training.ideas.java.mathSeries;

/**
 * Created by idnrkh on 8/12/2014.
 */
public class FindAngle {

    static   double totalMin;

    static double  hr_speed_perMin=0.5;
    static double min_speed_perMin=6;


    public static double  getAngleBetweenHourMin(int hour , int min) {

//        totalMin=(hour*60)+min;

        double  angleByMin= min*min_speed_perMin;
        double  angleByHour=min*hr_speed_perMin;

        double finalAngle=angleByMin-angleByHour;

        if (finalAngle<0)
        {
            finalAngle*=-1;
        }

        return finalAngle;
    }




}
