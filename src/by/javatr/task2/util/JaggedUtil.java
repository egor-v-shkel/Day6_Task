package by.javatr.task2.util;

public class JaggedUtil {
    public static String toString(int[][] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
