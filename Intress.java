import java.util.List;
import java.util.Scanner;

public class Intress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the principal amount : ");
        double principal = scanner.nextDouble();

        System.out.println("Please enter the time : ");
        double time = scanner.nextDouble();

        System.out.println("please enter the rate :");
        double rate = scanner.nextDouble();

        double simpleIntrest = (principal * time * rate) / 100;
        System.out.println("The simple interest is: " + simpleIntrest);
    }
    
}
