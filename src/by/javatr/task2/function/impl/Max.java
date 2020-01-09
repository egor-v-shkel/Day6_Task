package by.javatr.task2.function.impl;

import by.javatr.task2.function.JaggedFunction;

public class Max implements JaggedFunction {
    @Override
    public int apply(int[] array) {
        int max = array[0];
        for (int e :
                array) {
            if (e > max) max = e;
        }

        return max;
    }
}
