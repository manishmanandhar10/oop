package workshop1;

import java.util.Scanner;

public class qn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the length of one side of the square: ");
        double side = scanner.nextDouble();

        // Calculate the area of the square
        double area = side * side;

        // Display the result
        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}

