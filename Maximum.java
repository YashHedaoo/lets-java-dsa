
import java.util.Scanner;


public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long max = a; // Assume a is the maximum initially

        if (max< b) {
            max = b; // Update max if b is greater
        }else if (c > max) {
            max = c;
        
        }
        System.out.println("The maximum number is: " + max);
    }


    
}
