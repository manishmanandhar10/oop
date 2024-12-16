package workshop1;

import java.util.Scanner;

public class qn11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in miles
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        // Conversion factor: 1 mile = 1.60 kilometers
        double kilometers = miles * 1.60;

        // Display the result
        System.out.println("Equivalent distance in kilometers: " + kilometers);

        scanner.close();
    }
}

