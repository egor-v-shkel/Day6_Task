package by.javatr.task1.utill;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private Fibonacci() {
    }

    public static List<Integer> of(int[] array) {
        List<Integer> fibList = new ArrayList<>();

        for (int elem : array) {
            if (isFib(elem)) {
                fibList.add(elem);
            }
        }

        return fibList;
    }

    public static boolean isFib(int num) {
        return (isPerfectSquare((int) (5 * Math.pow(num, 2) + 4)) ||
                isPerfectSquare((int) (5 * Math.pow(num, 2) - 4)));
    }

    private static boolean isPerfectSquare(int num) {
        int n = (int) Math.sqrt(num);
        return (Math.pow(n, 2) == num);
    }
}
