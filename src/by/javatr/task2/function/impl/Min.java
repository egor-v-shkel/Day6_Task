package by.javatr.task2.function.impl;

import by.javatr.task2.function.JaggedFunction;

public class Min implements JaggedFunction {
    @Override
    public int apply(int[] array) {
        int min = array[0];
        for (int e :
                array) {
            if (e < min) min = e;
        }

        return min;
    }
}
