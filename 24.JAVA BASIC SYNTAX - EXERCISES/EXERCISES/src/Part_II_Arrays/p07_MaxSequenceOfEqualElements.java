package Part_II_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestMaxLenght = 1;
        int bestElement = elements[0];
        int maxLenght = 1;
        int startIndex = 0;
        int position = 1;
        for (int i = 1; i < elements.length; i++) {
            int element = elements[i];
            int startElement = elements[startIndex];
            if (element == startElement) {
                maxLenght++;
            } else {
                startIndex = i;
                maxLenght = 1;
            }

            if (bestMaxLenght < maxLenght) {
                bestMaxLenght = maxLenght;
                bestElement = startElement;
            }
        }


        String result = "";
        for (int i = 0; i < bestMaxLenght; i++) {
            result += bestElement + " ";
        }

        System.out.println(result);
    }
}
