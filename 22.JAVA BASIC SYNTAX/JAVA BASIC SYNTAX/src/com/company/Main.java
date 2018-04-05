package com.company;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        
    }

    //01. Expression
    public static void expression() {
        double val = ((((30 + 21) * 1) / 2) * ((35 - 12) - (1 / 2)));
        double sqrVal = Math.pow(val, 2);
        System.out.println(329189.0625);
    }

    //02. Sum Two Numbers
    public static void sumTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        double number1 = Double.parseDouble(scan.nextLine());
        double number2 = Double.parseDouble(scan.nextLine());
        double sum = number1 + number2;
        System.out.println(sum);
    }

    //03. 3 Integers Sum
    public static void threeIntegersSum() {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        if (!checkThreeIntegers(number1, number2, number3) &&
                !checkThreeIntegers(number2, number3, number1) &&
                !checkThreeIntegers(number1, number3, number2)) {
            System.out.println("No");
        }
    }

    //03. 3 Integers Sum
    static boolean checkThreeIntegers(
            int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }
        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        } else {
            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }
        return true;
    }


    //04. Sum N Integers
    public static void sumNIntegers() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean getNextInt = true;
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            sum += number;
        }

        System.out.printf("Sum = %d", sum);
    }

    //05. Symmetric Numbers
    public static void symmetricNumbers() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            String currentStringNum = Integer.toString(i);
            String currentStringNumReversed = new StringBuffer(currentStringNum).reverse().toString();
            if (currentStringNum.equals(currentStringNumReversed)) {
                System.out.println(i);
            }
        }
    }

    //06. Largest 3 Numbers
    public static void largest3Numbers() {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(nums);
        int takeElements = Math.min(3, nums.length);
        for (int i = 0; i < takeElements; i++) {
            int index = nums.length - 1 - i;
            System.out.println(nums[index]);
        }
    }

    //07. Sums by Town
    public static void sumsByTown() {
		Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> sumsByTown = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());
            if (sumsByTown.containsKey(town)) {
                sumsByTown.put(town, sumsByTown.get(town) + income);
            } else {
                sumsByTown.put(town, income);
            }
        }

        for (String key : sumsByTown.keySet()) {
            System.out.println(key + " -> " + sumsByTown.get(key));
        }

        //Scanner scan = new Scanner(System.in);
        //int count = Integer.parseInt(scan.nextLine());
        //LinkedHashMap<String, Double> towns = new LinkedHashMap<>();
        //for (int i = 0; i < count; i++) {
        //    String[] input = scan
        //            .nextLine()
        //            .split("\\|");
//
        //    String town = input[0].trim();
        //    double icome = Double.parseDouble(input[1].trim());
//
        //    if (towns.containsKey(town)) {
        //        double oldIcome = towns.get(town);
        //        towns.put(town, oldIcome + icome);
        //    } else {
        //        towns.put(town, icome);
        //    }
        //}
//
        //towns
        //        .entrySet()
        //        .stream()
        //        .sorted((t1, t2) -> t1.getKey().compareTo(t2.getKey()))
        //        .forEach(t -> {
        //            System.out.printf("%s -> %.1f%n", t.getKey(), t.getValue());
        //        });
    }
}
