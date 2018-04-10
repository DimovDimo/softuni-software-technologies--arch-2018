package Part_V_Classes_and_Objects.p24_Book_Library;

import Part_V_Classes_and_Objects.p23_Average_Grades.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, ArrayList<Book>> data = new TreeMap<>();
        int countBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countBooks; i++) {
            String[] parts = scanner.nextLine().split(" ");
            Book book = new Book(
                    parts[0],
                    parts[1],
                    parts[2],
                    LocalDate.parse(parts[3], DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                    parts[4],
                    Double.parseDouble(parts[5]));

            if (!data.containsKey(book.getAuthor())) {
                data.put(book.getAuthor(), new ArrayList<>());
            }

            data.get(book.getAuthor()).add(book);
        }
    }
}
