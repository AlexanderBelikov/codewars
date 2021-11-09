package info.belikov.codewars.k5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarMileage {
    private static boolean isInterestingSubFunc(int number, int[] awesomePhrases) {
        if (number < 100)
            return false;

        String numberString = String.valueOf(number);
        List<String> patternList = new ArrayList<>();
        for (int phrase: awesomePhrases) {
            patternList.add(String.valueOf(phrase));
        }
        patternList.add("\\d00+");
        patternList.add("(\\d)\\1\\1+");
        patternList.add(new StringBuilder(numberString).reverse().toString());
        String pattern = "^(" + String.join("|", patternList) + ")$";
        Matcher matcher = Pattern.compile(pattern).matcher(numberString);

        if (matcher.find())
            return true;
        if (Pattern.compile(numberString).matcher("1234567890").find())
            return true;
        if (Pattern.compile(numberString).matcher("9876543210").find())
            return true;

        return false;
    }

    public static int isInteresting(int number, int[] awesomePhrases) {
        if (isInterestingSubFunc(number, awesomePhrases))
            return 2;

        if (isInterestingSubFunc(number+1, awesomePhrases))
            return 1;

        if (isInterestingSubFunc(number+2, awesomePhrases))
            return 1;

        return 0;
    }
}
