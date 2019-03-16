package ua.in.soul.epamprojects;

import java.util.Arrays;
import static java.util.stream.Collectors.joining;

public class Task1 {
    public static void main(String[] args) {

        String[] string = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        printArray(string, "String: ");
        printReverseArray(string);
    }

    private static void printArray(String[] strings, String prefix) {
        String result = Arrays.stream(strings).collect(joining(", ", "[", "]"));
        System.out.println(prefix + result);
    }

    private static void printReverseArray(String[] strings) {
        String[] reversedStrings = new String[strings.length];
        int lastElementIndex = strings.length - 1;
        for (int i = 0; i < strings.length; i++) {
            reversedStrings[i] = strings[lastElementIndex - i];
        }
        printArray(reversedStrings, "Reverse strings: ");
    }
}
