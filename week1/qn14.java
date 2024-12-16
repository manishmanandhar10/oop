package workshop1;

import java.util.Scanner;

public class qn14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount in U.S. dollars
        System.out.print("Enter the amount in U.S. dollars: ");
        double usdAmount = scanner.nextDouble();

        // Prompt the user to enter the exchange rate
        System.out.print("Enter the exchange rate (1 USD to target currency): ");
        double exchangeRate = scanner.nextDouble();

        // Convert the amount to the target currency
        double convertedAmount = usdAmount * exchangeRate;

        // Display the converted amount
        System.out.println("The converted amount is: " + convertedAmount);

        scanner.close();
    }
}
