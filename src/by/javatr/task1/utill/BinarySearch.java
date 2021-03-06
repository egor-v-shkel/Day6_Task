package by.javatr.task1.utill;

public class BinarySearch {

    private BinarySearch() {}

    public static int binarySearch(int[] a, int fromIndex, int toIndex,
                                   int key) {
        int low = fromIndex;
        int high = toIndex;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}
