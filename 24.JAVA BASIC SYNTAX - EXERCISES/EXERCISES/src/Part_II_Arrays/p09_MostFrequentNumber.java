package Part_II_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bestElement = 0;
        int bestLenght = 0;
        for (int i = 0; i < elements.length; i++) {
            int element = elements[i];
            int curentLenght = 0;
            for (int j = 0; j < elements.length; j++) {
                int elementCheck = elements[j];
                if (element == elementCheck) {
                    curentLenght++;
                }
            }

            if (bestLenght < curentLenght) {
                bestLenght = curentLenght;
                bestElement = element;
            }
        }

        System.out.println(bestElement);
    }
}
