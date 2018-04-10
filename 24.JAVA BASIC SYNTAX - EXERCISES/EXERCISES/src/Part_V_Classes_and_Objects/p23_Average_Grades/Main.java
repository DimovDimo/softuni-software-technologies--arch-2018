package Part_V_Classes_and_Objects.p23_Average_Grades;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int countStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countStudent; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            ArrayList<Double> grades = new ArrayList<>();
            for (int j = 1; j < parts.length; j++) {
                grades.add(Double.parseDouble(parts[j]));
            }

            students.add(new Student(name, grades));
        }

        students
                .stream()
                .filter(s -> s.getAvaregeGrade() >= 5)
                .sorted(
                        Comparator
                                .comparing(Student::getName)
                                .thenComparing(Comparator.comparing(Student::getAvaregeGrade).reversed())
                )
                .collect(Collectors.toList())
        .forEach(r -> System.out.printf("%s -> %.2f%n", r.getName(), r.getAvaregeGrade()));
    }
}
