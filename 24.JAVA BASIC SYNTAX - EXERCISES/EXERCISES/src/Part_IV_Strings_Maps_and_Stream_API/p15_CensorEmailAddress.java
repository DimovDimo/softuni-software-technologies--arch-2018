package Part_IV_Strings_Maps_and_Stream_API;

import java.util.Scanner;

public class p15_CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String username = email.split("@")[0];
        String replasment = getReplacement(username.length(), "*", email);
        String text = scanner.nextLine();
        String result = text.replaceAll(email, replasment);
        System.out.println(result);
    }

    private static String getReplacement(int length, String s, String email) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(s);
        }

        String username = email.split("@")[0];
        return email.replaceFirst(username, sb.toString());
    }
}
