package wu.ui;
import wu.business.Account;
import wu.business.Transactions;

import java.util.Scanner;
/**
 * Created by Connie Wu on 2/19/2016.
 */
public class AccountApp {

    public static void print(Account a) {
        Console.displayLine("Checking: $" + a.getBalanceFormatted());
    }

    public static void main (String[] args) {
        System.out.println("Welcome to the Account Calculator");
        System.out.println();

        System.out.println("Starting Balance");
        System.out.println("Checking: ");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        Account a = new Account();

        while (choice.equalsIgnoreCase("y")){

            System.out.print("\nWithdraw or deposit? (w/d): ");
            String wOd = sc.nextLine();

            if (wOd.equalsIgnoreCase("w")){

                Transactions wt = new Transactions();
                double with = Console.getDouble("Amount: ");
                wt.withdraw(a, with);

            }
            else if (wOd.equalsIgnoreCase("d")){
                Transactions dt = new Transactions();
                double dep = Console.getDouble("Amount: ");
                dt.deposit(a, dep);

            }

            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }

        System.out.println("Final Balance");

        print(a);



    }
}
