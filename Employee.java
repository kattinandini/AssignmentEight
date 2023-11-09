package com.Bridgelab.assignment;
import java.util.Scanner;
public class Employee {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of hours worked: ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("Enter the hourly rate: ");
            double hourlyRate = scanner.nextDouble();

            double totalWage = calculateWage(hoursWorked, hourlyRate);
            System.out.println("Total wage: $" + totalWage);

            scanner.close();
        }

        public static double calculateWage(double hoursWorked, double hourlyRate) {
            double totalWage;

            if (hoursWorked <= 40) {
                totalWage = hoursWorked * hourlyRate;
            } else {
                totalWage = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
            }

            return totalWage;
        }
    }

}
