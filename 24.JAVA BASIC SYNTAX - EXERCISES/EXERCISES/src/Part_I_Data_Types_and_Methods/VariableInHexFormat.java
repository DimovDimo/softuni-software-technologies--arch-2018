package Part_I_Data_Types_and_Methods;

import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexFormat = scanner.nextLine();
        int output = Integer.parseInt(hexFormat, 16);
        System.out.println(output);
    }
}
