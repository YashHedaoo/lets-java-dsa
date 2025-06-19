import java.util.Scanner;
=
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name : ");

        String fruit = sc.next();

        switch(fruit) {
            
            case "Mango":
                System.out.println("Its king of fruits");
                break;

            case "Apple":
                System.out.println("Its my favourite ");
                break;
            
            case "Bannana":
                System.out.println("Its important for bulking");
                break;

            case "orange":
                System.out.println("its famous in nagpur");
                break;

            default:
                System.out.println("Enter valit fruit name");
        }
        System.out.println("Enter the number between 1 to 7 : ");
        int num = sc.nextInt();

        switch (num) {

            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Enter valid number between 1 to 7");
                break;
        }
        System.out.println("Now you eat this fruit :)");

    }

    
}
