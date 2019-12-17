package by.javatr.task2.util;

import by.javatr.task2.Interfaces.JaggedFunction;

public enum Condition implements JaggedFunction {
    MAX_ELEM(Condition::max),
    MIN_ELEM(Condition::min),
    ELEMENTS_SUM(Condition::sum);

    private final JaggedFunction function;

    private Condition(final JaggedFunction function) {
        this.function = function;
    }

    @Override
    public int apply(int[] arr) {
        return function.apply(arr);
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int e :
                array) {
            sum += e;
        }

        return sum;
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int e :
                array) {
            if (e < min) min = e;
        }

        return min;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int e :
                array) {
            if (e > max) max = e;
        }

        return max;
    }
}
