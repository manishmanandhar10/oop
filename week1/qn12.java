package workshop1;

import java.util.Scanner;

public class qn12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle: Area = π * r * r
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}

