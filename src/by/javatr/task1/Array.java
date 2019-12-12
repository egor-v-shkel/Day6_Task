package by.javatr.task1;

import by.javatr.task1.valid.ArrayValidator;

import java.util.List;

public class Array implements Cloneable {

    int[] value;

    public Array(List<Integer> list) {
        int listSize = list.size();
        this.value = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            value[i] = list.get(i);
        }
    }

    public Array(int... arr) {
        this.value = arr;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        ArrayValidator.validateNotNull(value);
        this.value = value;
    }

    public int length() {
        return value.length;
    }

    @Override
    public Array clone() throws CloneNotSupportedException {
        return (Array) super.clone();
    }

    public int getElementAt(int index) {
        ArrayValidator.validateNotNull(this);
        ArrayValidator.validateIndex(this, index);

        return value[index];
    }

    public void setElementAt(int index, int value) {
        ArrayValidator.validateIndex(this, index);

        this.value[index] = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;

        if (value==array.value)
            return true;
        if (value==null || array.value==null)
            return false;

        int length = value.length;
        if (array.value.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (value[i] != array.value[i])
                return false;

        return true;
    }

    @Override
    public int hashCode() {
        if (value == null)
            return 0;

        int result = 1;
        for (int element : value)
            result = 31 * result + element;

        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value=" + arrToStr(value) +
                '}';
    }

    private static String arrToStr(int[] arr){
        if (arr == null)
            return "null";
        int iMax = arr.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; ; i++) {
            builder.append(arr[i]);
            if (i == iMax)
                return builder.append(']').toString();
            builder.append(", ");
        }
    }
}
