package Part_I_Data_Types_and_Methods;

import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        String hex = Integer.toHexString(decimal).toUpperCase();
        String binary = Integer.toString(decimal,2);
        System.out.println(hex);
        System.out.println(binary);
    }
}
