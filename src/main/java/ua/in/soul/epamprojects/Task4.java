package ua.in.soul.epamprojects;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int size = getSize();
        int[] numbers = createArrayInt(size);
        System.out.println("Array -> " + Arrays.toString(numbers));
        distributionOfValues(numbers);
    }

    private static int getSize() {

        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while (size == 0) {
            try {
                System.out.print("Enter size of arrays -> ");
                size = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Исключение: " + e);
            }
        }
        return size;
    }

    private static int[] createArrayInt(int size) {
        if (size < 1) {
            return null;
        }
        int[] arrayInt = new int[size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 200 - 100);
        }
        return arrayInt;
    }

    private static void distributionOfValues(int[] numbers) {
        int size = numbers.length;
        int[] positiveNumbers = new int[size];
        int nextPositiveIndex = 0;
        int[] negativeNumbers = new int[size];
        int nextNegativeIndex = 0;

        for (int element : numbers) {
            if (element < 0) {
                negativeNumbers[nextNegativeIndex++] = element;
            } else {
                positiveNumbers[nextPositiveIndex++] = element;
            }
        }
        printArray(nextNegativeIndex, negativeNumbers, "Negative array:");
        printArray(nextPositiveIndex, positiveNumbers, "Positive array:");
    }

    private static void printArray(int to, int[] array, String prefix) {
        printArray(0, to, array, prefix);
    }

    private static void printArray(int from, int to, int[] array, String prefix) {
        if (from < 0 || to >= array.length) {
            return;
        }
        System.out.print(prefix + " [");
        for (int i = from; i < to; i++) {
            System.out.print(array[i]);
            if (i < to - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}