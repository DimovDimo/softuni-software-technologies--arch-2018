package Part_V_Classes_and_Objects;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class p20_CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstDate = scanner.nextLine();
        String secondDate = scanner.nextLine();
        String formatString = "dd-MM-yyyy";
        DateTimeFormatter format = DateTimeFormatter.ofPattern(formatString);
        LocalDateTime startDate = LocalDateTime.from(LocalDate.parse(firstDate, format).atStartOfDay());
        LocalDateTime endDate = LocalDateTime.from(LocalDate.parse(secondDate, format).atStartOfDay());
        int workingdays = 0;
        while (startDate.compareTo(endDate) <= 0) {
            HashSet<String> holidays = new HashSet<>(Arrays.asList("1-1", "3-3", "1-5", "6-5", "24-5", "6-9", "22-9", "1-11", "24-12", "25-12", "26-12"));
            String dateString = String.format("%d-%d", startDate.getDayOfMonth(), startDate.getMonthValue());
            boolean holday = holidays.contains(dateString);
            if (startDate.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    startDate.getDayOfWeek() != DayOfWeek.SUNDAY &&
                    !holday) {
                workingdays++;
            }

            startDate = startDate.plusDays(1);
        }

        System.out.println(workingdays);
    }
}
