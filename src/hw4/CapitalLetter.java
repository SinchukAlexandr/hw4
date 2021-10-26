package hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static String changeString(String string) {
        String result =  "";
        String[] tempResult = string.split("\\s+");

        for (int i = 0; i < tempResult.length; i++) {
            if (tempResult.length >= 1) {
                if (i == tempResult.length - 1)
                    result += (tempResult[i].substring(0, 1).toUpperCase() + tempResult[i].substring(1, tempResult[i].length()));
                else
                    result += tempResult[i].substring(0, 1).toUpperCase() + tempResult[i].substring(1, tempResult[i].length()) + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String userString, changesString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");
        userString = scanner.nextLine();
        changesString = changeString(userString);
        System.out.println("Your changes String: ");
        System.out.println(changesString);
    }
}
