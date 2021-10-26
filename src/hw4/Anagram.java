package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String stringFirst, String stringSecond) {
        char[] first = stringFirst.replaceAll("\\s+|\\,", "").toLowerCase().toCharArray();
        char[] second = stringSecond.replaceAll("\\s+|\\,", "").toLowerCase().toCharArray();

        if (first.length != second.length) return false;

        int counter = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    second[j] = 0;
                    counter++;
                }
                continue;
            }
        }
        System.out.println(Arrays.toString(second));
        if (counter == first.length) return true;
        else return false;
    }

    public static void main(String[] args) {
        String stringFirst, stringSecond;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        stringFirst = scanner.nextLine();
        System.out.println("Enter second string: ");
        stringSecond = scanner.nextLine();
        System.out.println("Strings are anagram: " + anagram(stringFirst, stringSecond));
    }
}
