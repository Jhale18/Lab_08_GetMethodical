import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int daysInMonth = (month == 2) ? (isLeapYear(year) ? 29 : 28) :
                ((month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31);
        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, daysInMonth);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);
        System.out.println("You were born on " + year + "-" + month + "-" + day + " at " + hour + ":" + minute);
        in.close();
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
