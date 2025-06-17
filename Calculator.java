import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("choose inbetween +, -, *, /");
        String operator = scanner.next();
        double result;
        if (operator.equals("+")) {
            result = number1 + number2;
            System.out.println("The result is: " + result);
        } else if (operator.equals("-")) {
            result = number1 - number2;
            System.out.println("The result is: " + result);
        } else if (operator.equals("*")) {
            result = number1 * number2;
            System.out.println("The result is: " + result);
        } else if (operator.equals("/")) {
            if (number2 != 0) {
                result = number1 / number2;
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
            
        }

    }
    
}
