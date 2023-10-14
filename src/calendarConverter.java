/**
 * Calendar Converter Program
 * This Java program allows users to input numerical values representing a date and
 * converts them into human-readable information, including the month, day, and year.
 * It also includes functionality to determine if the year is a leap year.*/

import java.util.Scanner;
import java.util.Objects;

public class calendarConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month;
        int day;
        int year;
        String a;

        do {    // month if-else-if statement
            System.out.println("Enter a month from 1 to 12: ");
            while (true) {
                month = scan.nextInt();
                if (month == 1) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else if (month == 2) {
                    System.out.println("Enter a day from 1 to 29: ");
                    break;
                } else if (month == 3) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else if (month == 4) {
                    System.out.println("Enter a day from 1 to 30: ");
                    break;
                } else if (month == 5) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else if (month == 6) {
                    System.out.println("Enter a day from 1 to 30: ");
                    break;
                } else if (month == 7) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else if (month == 8) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else if (month == 9) {
                    System.out.println("Enter a day from 1 to 30: ");
                    break;
                } else if (month == 10) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else if (month == 11) {
                    System.out.println("Enter a day from 1 to 30: ");
                    break;
                } else if (month == 12) {
                    System.out.println("Enter a day from 1 to 31: ");
                    break;
                } else {
                    System.out.println("Invalid month. Enter a month from 1 to 12: ");
                }
            }


            // days if-else-if statement
            String monthName;
            while (true) {
                day = scan.nextInt();
                if (month == 1 && day <= 31 && day >= 1) {
                    monthName = "January";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 2 && day <= 29 && day >= 1) {
                    monthName = "February";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 3 && day <= 31 && day >= 1) {
                    monthName = "March";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 4 && day <= 30 && day >= 1) {
                    monthName = "April";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 5 && day <= 31 && day >= 1) {
                    monthName = "May";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 6 && day <= 30 && day >= 1) {
                    monthName = "June";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 7 && day <= 31 && day >= 1) {
                    monthName = "July";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 8 && day <= 31 && day >= 1) {
                    monthName = "August";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 9 && day <= 30 && day >= 1) {
                    monthName = "September";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 10 && day <= 31 && day >= 1) {
                    monthName = "October";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 11 && day <= 30 && day >= 1) {
                    monthName = "November";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else if (month == 12 && day <= 31 && day >= 1) {
                    monthName = "December";
                    System.out.println("Enter a year from 1 to 99: ");
                    break;
                } else {
                    System.out.println("Invalid day. Enter a day: ");


                }
            }


            // years if-else statement

            boolean isLeapYear;

            isLeapYear = day == 29 && month == 2;

            while (!isLeapYear) {
                year = scan.nextInt();
                if (year <= 99 && year >= 1) {
                    System.out.println(monthName + " " + day + ", " + (2000 + year) + ".");
                    break;
                } else {
                    System.out.println("Invalid year. Enter a year from 1 to 99: ");

                }
            }
            while (isLeapYear) {
                year = scan.nextInt();
                if (year % 4 != 0) {
                    System.out.println("Year is not leap. Enter a year from 1 to 99: ");

                } else {
                    System.out.println(monthName + " " + day + ", " + (2000 + year) + ".");
                }
            }
            do {
                System.out.println("Want to go again?: Y/N");
                a = scan.next();

            } while (!Objects.equals(a, "N") && !Objects.equals(a, "Y"));
        } while (Objects.equals(a, "Y"));

    }
}
