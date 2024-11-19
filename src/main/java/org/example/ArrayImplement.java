package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayImplement {
    public static int binarySearch(byte[] a, byte key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(char[] a, char key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(double[] a, double key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(float[] a, float key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(int[] a, int key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(long[] a, long key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(short[] a, short key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }


    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearchRecursive(a, 0, a.length -1, key, c);
    }

    private static <T> int binarySearchRecursive(T[] a, int low, int high, T key, Comparator<? super T> c) {
        if (low > high) return -(low + 1);
        int mid = low + (high - low) / 2;
        int cmp = c.compare(a[mid], key);
        if (cmp < 0)
            return binarySearchRecursive(a, mid + 1, high, key, c);
        else if (cmp > 0)
            return binarySearchRecursive(a, low, mid - 1, key, c);
        else
            return mid;
    }


    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex >= a.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return binarySearchRecursive(a, fromIndex, toIndex, key, c);
    }
}
