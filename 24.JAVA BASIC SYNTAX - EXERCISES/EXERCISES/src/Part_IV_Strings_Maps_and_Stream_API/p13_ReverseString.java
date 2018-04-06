package Part_IV_Strings_Maps_and_Stream_API;

import java.util.Scanner;

public class p13_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
    }
}
