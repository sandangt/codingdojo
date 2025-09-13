package dojo.sedgewick.sorting;

import java.util.Comparator;


public class SortUtils {

    public static boolean less(Comparable e1, Comparable e2) {
        return e1.compareTo(e2) < 0;
    }

    public static boolean less(Comparable e1, Comparable e2, Comparator comparator) {
        return comparator.compare(e1, e2) < 0;
    }

    public static void exch(Object[] arr, int pos1, int pos2) {
        Object temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}
