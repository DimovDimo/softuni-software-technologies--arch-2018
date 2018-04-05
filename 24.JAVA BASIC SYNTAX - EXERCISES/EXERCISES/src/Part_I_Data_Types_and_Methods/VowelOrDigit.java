package Part_I_Data_Types_and_Methods;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class VowelOrDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] digits = "0123456789".toCharArray();
        char[] vowels = "aeiouy".toCharArray();
        String letter = scanner.nextLine().toLowerCase();
        if (new String(digits).indexOf(letter) >= 0) {
            System.out.println("digit");
        } else if (new String(vowels).indexOf(letter) >= 0) {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
