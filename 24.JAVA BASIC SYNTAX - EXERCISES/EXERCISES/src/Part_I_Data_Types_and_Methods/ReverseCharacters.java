package Part_I_Data_Types_and_Methods;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letters = new String[3];
        letters[0] = scanner.nextLine();
        letters[1] = scanner.nextLine();
        letters[2] = scanner.nextLine();
        for (int i = letters.length -1; i >= 0 ; i--) {
            System.out.printf("%s", letters[i]);
        }
    }
}
