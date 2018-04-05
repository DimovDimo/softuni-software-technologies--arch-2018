package Part_II_Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] first = scanner
                .nextLine()
                .toCharArray();
        char[] second = scanner
                .nextLine()
                .toCharArray();
        if (first.equals(second)) {
            printArrWithoutSpase(first);
            printArrWithoutSpase(second);
        } else {
            int endIndex = Math.min(first.length, second.length);
            for (int i = 0; i < endIndex; i++) {
                if (first[i] == ' ') {
                    continue;
                }

                if (first[i] > second[i]) {
                    printArrWithoutSpase(second);
                    printArrWithoutSpase(first);
                    break;
                } else if (first[i] < second[i]) {
                    printArrWithoutSpase(first);
                    printArrWithoutSpase(second);
                    break;
                }

                if (i == endIndex - 1) {
                    if (first.length > second.length) {
                        printArrWithoutSpase(second);
                        printArrWithoutSpase(first);
                    } else {
                        printArrWithoutSpase(first);
                        printArrWithoutSpase(second);
                    }
                }
            }
        }
    }

    public static void printArrWithoutSpase(char[] arr) {
        for (char c : arr) {
            if (c != ' ') {
                System.out.printf("%c", c);
            }
        }

        System.out.println();
    }
}
