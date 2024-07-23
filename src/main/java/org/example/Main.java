package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of digits:");

        String input = scanner.nextLine();

        if (!input.matches("\\d+")) {
            System.out.println("Invalid input! Please enter only digits.");
            return;
        }

        String[] output = {"", "", ""};

        for (char ch : input.toCharArray()) {
            String[] digitLines = getDigitLines(ch);
            for (int i = 0; i < 3; i++) {
                output[i] += digitLines[i];
            }
            System.out.println(output.length);
        }

        for (String line : output) {
            System.out.println(line);
        }
    }

    private static String[] getDigitLines(char ch) {
        switch (ch) {
            case '0':
                return new String[]{" _ ", "| |", "|_|"};
            case '1':
                return new String[]{"   ", "  |", "  |"};
            case '2':
                return new String[]{" _ ", " _|", "|_ "};
            case '3':
                return new String[]{" _ ", " _|", " _|"};
            case '4':
                return new String[]{"   ", "|_|", "  |"};
            case '5':
                return new String[]{" _ ", "|_ ", " _|"};
            case '6':
                return new String[]{" _ ", "|_ ", "|_|"};
            case '7':
                return new String[]{" _ ", "  |", "  |"};
            case '8':
                return new String[]{" _ ", "|_|", "|_|"};
            case '9':
                return new String[]{" _ ", "|_|", " _|"};
            default:
                return new String[]{"", "", ""};
        }
    }
}