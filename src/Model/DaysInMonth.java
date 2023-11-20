package Model;

import java.util.Scanner;

//this is not for model exam

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Check if the entered month is valid (between 1 and 12)
        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered!");
        } else {
            // Determine the number of days in the given month
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("Number of days in the entered month: " + daysInMonth);
        }

        scanner.close();
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int daysInMonth;

        // Array to store the number of days in each month (considering leap year for February)
        int[] daysPerMonth = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Subtract 1 from month to match array index
        daysInMonth = daysPerMonth[month - 1];

        return daysInMonth;
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

