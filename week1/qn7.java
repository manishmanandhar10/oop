package workshop1;

import java.util.Scanner;

public class qn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius and height of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder: V = π * r² * h
        double volume = Math.PI * radius * radius * height;

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }
}
