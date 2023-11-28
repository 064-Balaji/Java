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

        Days(month, year);
    }

    static void Days(int month, int year){

    }
}

