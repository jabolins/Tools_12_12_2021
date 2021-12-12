package juris;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * input String for check and combination (String) what need to find
 * find count of this combination and all starts of it
 */
public class StringAnalyzer {

    /**
     *
     * @param forCheck - String where will find combination
     * @param toFind- combination (String) what we want to find
     * @return int - count of combinations (toFind) in String (forCheck)
     */
    public static int countOfCombination(String forCheck, String toFind) {

        Pattern pattern = Pattern.compile(toFind);
        Matcher matcher = pattern.matcher(forCheck);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    /**
     *
     * @param forCheck - String where will find combination
     * @param toFind - combination (String) what we want to find
     * @return ArrayList<Integer> - if a combination is found, the starting positon of each combination
     */
    public static ArrayList<Integer> startPositions(String forCheck, String toFind){
        ArrayList<Integer> startPositions = new ArrayList<>();

        Pattern pattern = Pattern.compile(toFind);
        Matcher matcher = pattern.matcher(forCheck);

        while (matcher.find()) {
            startPositions.add(matcher.start());
        }

        return startPositions;
    }

    private static void printResult(String forCheck, String toFind, ArrayList<Integer> startPositions, int counter) {
        System.out.printf("your combination: %s, was found  %d  times in the string %s %n", toFind, counter, forCheck);
        System.out.printf("beginnings of %s are in positions: ", toFind);
        for (int i = 0; i < startPositions.size(); i++) {
            System.out.print((startPositions.get(i) + 1) + "; ");
        }
    }
}
