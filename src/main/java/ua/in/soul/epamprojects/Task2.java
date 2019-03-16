package ua.in.soul.epamprojects;

import java.util.Arrays;

public class Task2 {
    private static int[] intArray = createArrayInt(7);

    public static void main(String[] args) {
        System.out.println("Array -> " + Arrays.toString(intArray));
        returnCount(intArray);
        returnSum(intArray);
    }

    private static int[] createArrayInt(int size) {
        if (size < 1) {
            return null;
        }
        int[] arrayInt = new int[size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 10);
        }
        return arrayInt;
    }

    private static void returnCount(int[] intArray) {
        if (intArray == null) {
            return;
        }
        int count = 0;
        System.out.print("Odd elements: ");
        for (int element : intArray) {
            if (element % 2 == 1) {
                count++;
                System.out.print(element + " ");
            }
        }
        System.out.println("\nNumber of odd elements -> " + count);
    }

    private static void returnSum(int[] intArr) {
        if (intArray == null) {
            return;
        }
        int sum = 0;
        for (int element : intArr) {
            if (element % 2 == 1) {
                sum += element;
            }
        }
        System.out.println("Sum of odd elements -> " + sum);
    }
}
