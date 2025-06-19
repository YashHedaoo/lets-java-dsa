import java.util.Scanner;
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0, product = 1;
        while(n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        System.out.println("Result: " + (product - sum));
    }
}
