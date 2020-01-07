package OverloadedGenericMethodPrintArray;

import java.io.IOException;

public class OverloadedGenericMethodPrintArray {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);
        printArray(integerArray, 1, 9);
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);
        printArray(doubleArray, 3, 6);
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);
        printArray(characterArray, 2, 4);
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript) {
        if ((lowSubscript < 0) || (lowSubscript > inputArray.length) || (lowSubscript > highSubscript)
                || (highSubscript > inputArray.length) || (highSubscript < 0)) {
            try {
                throw new InvalidSubscriptException();
            } catch (InvalidSubscriptException e) {
                System.out.println("The user made one of these mistakes (lowSubscript or highSubscript is out of range): " +
                        "\nlowSubscript < 0 or lowSubscript > inputArray.length or lowSubscript > highSubscript or highSubscript > inputArray.length or highSubscript < 0");
            }
        } else System.out.printf("Number of elements printed is %d\n", highSubscript - lowSubscript);
    }
}
