package by.javatr.task1.utill;

import java.util.Set;
import java.util.TreeSet;

public class DigitRepetition {

    public static boolean hasNoRepetitions(int num) {

        Set<Integer> numDigitsSet = new TreeSet<>();

        while (num != 0) {
            int d = num % 10;
            boolean stat = numDigitsSet.add(d);

            if (!stat) return false;
            num = num / 10;
        }
        return true;
    }
}
