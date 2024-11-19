package org.example;

import java.util.Comparator;
import java.util.List;

public class Comparatorimplement {
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return java.util.Collections.binarySearch(list, key);
    }

    // Реализация для Comparator требует рекурсивного подхода
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        // Рекурсивная реализация бинарного поиска с Comparator для List
        //  (аналогично реализации для Arrays с Comparator)
        return binarySearchRecursive(list, 0, list.size() - 1, key, c);
    }

    private static <T> int binarySearchRecursive(List<? extends T> list, int low, int high, T key, Comparator<? super T> c){
        if(low > high) return -(low + 1);
        int mid = low + (high - low) / 2;
        int cmp = c.compare(list.get(mid), key);
        if(cmp < 0) return binarySearchRecursive(list, mid + 1, high, key, c);
        else if (cmp > 0) return binarySearchRecursive(list, low, mid - 1, key, c);
        else return mid;
    }
}
