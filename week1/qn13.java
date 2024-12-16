package workshop1;

import java.util.Scanner;

public class qn13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the quantity and price per item
        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();

        // Calculate the total cost: Total Cost = quantity * price
        double totalCost = quantity * price;

        // Display the total cost
        System.out.println("The total cost is: " + totalCost);

        scanner.close();
    }
}

