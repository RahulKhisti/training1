package training.ideas.java.mathSeries;

/**
 * Created by idnrkh on 8/11/2014.
 */
public class FissBuzz {
    public static String getFissBuzz(int givenNumber) {

        String Hold="";
        for(int counter=1;counter<=givenNumber;counter++) {

            if((counter)%3==0 || (counter)%5==0 ){
                if((counter)%3==0){
                    Hold+="Fizz";
                }
                if((counter)%5==0){
                    Hold+="Buzz";
                }
            }

            else {
                Hold+= counter+"";
            }

        }
        return Hold;
    }


}

