package org.example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("ArraysImpl.binarySearch(intArray, 23): " + ArrayImplement.binarySearch(intArray, 23)); // 5
        System.out.println("ArraysImpl.binarySearch(intArray, 0, 5, 12): " + ArrayImplement.binarySearch(intArray, 0, 5, 12)); // 3

        String[] stringArray = {"apple", "banana", "cherry", "date"};
        Comparator<String> stringComparator = Comparator.comparing(String::length);
        System.out.println("ArraysImpl.binarySearch(stringArray, \"banana\", stringComparator): " + ArrayImplement.binarySearch(stringArray, "banana", stringComparator)); // Error: NotImplemented

        // Примеры использования CollectionsImpl
        List<Integer> intList = Arrays.asList(2, 5, 8, 12, 16, 23, 38, 56, 72, 91);
        System.out.println("CollectionsImpl.binarySearch(intList, 23): " + Comparatorimplement.binarySearch(intList, 23)); // 5

        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("CollectionsImpl.binarySearch(stringList, \"banana\", stringComparator): " + Comparatorimplement.binarySearch(stringList, "banana", stringComparator)); //Error: NotImplemented

        // Пример с обработкой исключения:
        try {
            System.out.println(ArrayImplement.binarySearch(intArray, 100, 105, 12)); //Вызовет исключение
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
