package Part_II_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p11_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isNotEqual = true;
        for (int i = 0; i < elements.length; i++) {
            int sumLeft = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += elements[j];
            }

            int sumRight = 0;
            for (int j = i + 1; j < elements.length; j++) {
                sumRight += elements[j];
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                isNotEqual = false;
                break;
            }
        }

        if (isNotEqual) {
            System.out.println("no");
        }
    }
}
