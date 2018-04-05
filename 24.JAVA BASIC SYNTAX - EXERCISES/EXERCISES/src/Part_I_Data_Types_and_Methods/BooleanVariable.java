package Part_I_Data_Types_and_Methods;

import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (Boolean.parseBoolean(scanner.nextLine())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
