package Part_II_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class p12_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int[] commands = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int target = commands[0];
        int lenght = commands[1];
        while (numbers.contains(target)){
            int index = numbers.indexOf(target);
            int leftIndex = Math.max(0, index - lenght);
            int rightIndex = Math.min(numbers.size() - 1, index + lenght);
            numbers.subList(leftIndex, rightIndex + 1).clear();
        }

        int sum = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
