import java.util.Scanner;


public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the amount in INR : ");
        double amountINR = scanner.nextDouble();

            System.out.println("the ammount in USD: $" + convertToUSD(amountINR));
        }
    
        static double convertToUSD(double amountINR) {
            return amountINR / 82.73; // Assuming 1 USD = 82.73 INR
    }
}
