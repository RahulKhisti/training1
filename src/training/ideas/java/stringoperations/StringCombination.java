package training.ideas.java.stringoperations;

/**
 * Created by idnrkh on 8/14/2014.
 */
public class StringCombination {

    public static String[] getCombinations(String givenString) {
        String[] expectedCombinations = new String[givenString.length()];
        expectedCombinations[0]=givenString;
        for (int counter = 1; counter < givenString.length() ; counter++) {
            String remainingString = "";
            String hold = "";
            hold=expectedCombinations[counter-1].substring(0,1);
            remainingString=expectedCombinations[counter-1].substring(1,expectedCombinations[counter-1].length());
            remainingString+=hold;
            expectedCombinations[counter]=remainingString;

        }
    return expectedCombinations;
    }

}
