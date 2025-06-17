import java.util.Scanner;



public class Greating {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name:");
    String name = input.nextLine();
    System.out.println("Have a great day " + name + "!");
}
}