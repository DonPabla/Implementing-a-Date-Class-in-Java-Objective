import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date provided.");
        }
    }

    public boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1)
            return false;

        int[] daysInMonth = {
                31, isLeapYear(year) ? 29 : 28, 31, 30,
                31, 30, 31, 31, 30, 31, 30, 31
        };

        return day <= daysInMonth[month - 1];
    }

    public boolean isValidDate() {
        return isValidDate(day, month, year);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void updateDate(int d, int m, int y) {
        if (isValidDate(d, m, y)) {
            this.day = d;
            this.month = m;
            this.year = y;
        } else {
            System.out.println("Cannot update. Invalid date.");
        }
    }

    public String getDayOfWeek() {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        } catch (Exception e) {
            return "Invalid date";
        }
    }

    public int calculateDifference(Date other) {
        try {
            LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
            LocalDate otherDate = LocalDate.of(other.year, other.month, other.day);
            return Math.abs((int) (thisDate.toEpochDay() - otherDate.toEpochDay()));
        } catch (Exception e) {
            System.out.println("Error calculating difference.");
            return -1;
        }
    }

    public void printDate() {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            String monthName = date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            System.out.println(monthName + " " + day + ", " + year);
        } catch (Exception e) {
            System.out.println("Invalid date");
        }
    }

    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        return Integer.compare(this.day, other.day);
    }
}
