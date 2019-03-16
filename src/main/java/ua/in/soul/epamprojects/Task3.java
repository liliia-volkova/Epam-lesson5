package ua.in.soul.epamprojects;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int size = getSize();

        int[] array1 = createArrayInt(size);
        int[] array2 = createArrayInt(size);

        System.out.println("Array 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));

        sumArray(array1, array2);
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
            arrayInt[i] = (int) (Math.random() * 10);
        }
        return arrayInt;
    }

    private static void sumArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return;
        }

        int size = array1.length;

        int[] summedArray = new int[size];
        for (int i = 0; i < size; i++) {
            summedArray[i] = array1[i] + array2[i];
        }
        System.out.println("Array with sums of pairwise values -> " + Arrays.toString(summedArray));
    }
}
