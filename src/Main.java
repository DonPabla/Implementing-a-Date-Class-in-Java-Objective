//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();

        try {
            // Valid dates
            Date date1 = new Date(1, 1, 2023);
            Date date2 = new Date(15, 8, 2020);
            Date date3 = new Date(29, 2, 2024); // leap year
            Date date4 = new Date(25, 12, 2021);

            // Invalid date example
            try {
                Date invalidDate = new Date(31, 2, 2023);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught exception for invalid date: " + e.getMessage());
            }

            // Update example
            date1.updateDate(5, 10, 2022); // valid
            date2.updateDate(31, 2, 2023); // invalid

            // Print day of the week
            System.out.println("Day of week for date1: " + date1.getDayOfWeek());

            // Calculate difference
            System.out.println("Difference between date1 and date3: " + date1.calculateDifference(date3) + " days");

            // Add to list
            dateList.add(date1);
            dateList.add(date2);
            dateList.add(date3);
            dateList.add(date4);

            // Before sort
            System.out.println("\nDates before sorting:");
            for (Date d : dateList) {
                d.printDate();
            }

            // Sort
            Collections.sort(dateList);

            // After sort
            System.out.println("\nDates after sorting:");
            for (Date d : dateList) {
                d.printDate();
            }

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
