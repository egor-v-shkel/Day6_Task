package by.javatr.task2.function.impl;

import by.javatr.task2.function.JaggedFunction;

public class Summ implements JaggedFunction {
    @Override
    public int apply(int[] array) {
        int sum = 0;
        for (int e :
                array) {
            sum += e;
        }

        return sum;
    }
}
