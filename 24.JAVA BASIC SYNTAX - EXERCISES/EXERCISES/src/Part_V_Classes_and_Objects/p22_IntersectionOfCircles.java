package Part_V_Classes_and_Objects;

import java.util.Scanner;

public class p22_IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle first = new Circle(
                new Point(scanner.nextInt(), scanner.nextInt()),
                scanner.nextInt()
        );

        Circle second = new Circle(
                new Point(scanner.nextInt(), scanner.nextInt()),
                scanner.nextInt()
        );

        double firstPart = Math.pow(
                first.getCenter().getX() - second.getCenter().getX(),
                2);

        double secondPart = Math.pow(
                first.getCenter().getY() - second.getCenter().getY(),
                2);

        double distance = Math.sqrt(firstPart + secondPart);
        double radiusSum = first.getRedius() + second.getRedius();
        if (distance <= radiusSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

