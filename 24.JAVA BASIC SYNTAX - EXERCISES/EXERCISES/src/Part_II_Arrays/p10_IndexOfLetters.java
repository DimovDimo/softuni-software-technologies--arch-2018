package Part_II_Arrays;

import java.util.Scanner;

public class p10_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letters = scanner
                .nextLine()
                .toLowerCase()
                .toCharArray();
        for (char letter : letters) {
            int result = (int)letter - 97;
            System.out.printf("%s -> %d", letter, result);
            System.out.println();
        }
    }
}
