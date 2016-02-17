package wu.ui;
import java.util.Scanner;
public class PersonApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Person Tester application");
        System.out.println();

        Scanner sc = new Scanner (System.in);
        String choice1 = "c";
        While(choice.equalsIgnoreCase("c")) {
            System.out.print("Enter first name:  ");
            String first = sc.nextLine();
            System.out.print("Enter last name:  ");
            String last = sc.nextLine();
            System.out.print("Enter email address:  ");
            String mail = sc.nextLine();
            System.out.print("Customer number:  ");
            String num = sc.nextLine();
            System.out.println();
            System.out.println("You entered:");
            System.out.println("Name: " + first + last);
            System.out.println("Email: " + mail);
            System.out.println("Customer number: " + num);
            System.out.println();

        }
    }

}
