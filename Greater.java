import java.util.List;
import java.util.Scanner;



public class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        Integer number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        Integer number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("The greater number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The greater number is: " + number2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    
}

}