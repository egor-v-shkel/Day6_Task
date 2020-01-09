package by.javatr.task2.function.impl;

import by.javatr.task2.function.JaggedBiFunction;

public class Ascending implements JaggedBiFunction {

    @Override
    public boolean apply(int array1, int array2) {
        return array1 > array2;
    }
}
