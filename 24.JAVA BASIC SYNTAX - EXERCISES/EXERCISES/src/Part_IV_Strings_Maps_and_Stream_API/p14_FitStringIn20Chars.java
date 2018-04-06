package Part_IV_Strings_Maps_and_Stream_API;

import java.util.Scanner;

public class p14_FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        if(stringInput.length() >= 20){
            String stringOutput = stringInput.substring(0, 20);
            System.out.println(stringOutput);
        }else {
            String stringOutput = LPad(stringInput, 20, '*');
            System.out.println(stringOutput);
        }
    }

    public static String RPad(String str, Integer length, char car) {
        return String.format("%" + (length - str.length()) + "s", "")
                .replace(" ", String.valueOf(car))
                +
                str;
    }

    public static String LPad(String str, Integer length, char car) {
        return str
                +
                String.format("%" + (length - str.length()) + "s", "")
                        .replace(" ", String.valueOf(car));
    }
}
