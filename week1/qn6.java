package workshop1;

import java.util.Scanner;

public class qn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Output the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}

