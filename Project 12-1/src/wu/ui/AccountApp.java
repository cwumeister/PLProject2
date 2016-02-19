package wu.ui;
import java.util.Scanner;
/**
 * Created by Connie Wu on 2/19/2016.
 */
public class AccountApp {

    public static void main (String[] args) {
        System.out.println("Welcome to the Account Calculator");
        System.out.println();

        System.out.println("Starting Balance");
        System.out.println("Checking: ");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")){

            System.out.print("\nWithdraw or deposit? (w/d): ");
            String wOd = sc.nextLine();

            if (wOd.equalsIgnoreCase("w")){
                System.out.print("Withdraw");
            }
            else if (wOd.equalsIgnoreCase("d")){
                System.out.println("Desposit");
            }

            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }

    }
}
