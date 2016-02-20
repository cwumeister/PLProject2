package wu.ui;
import wu.business.Account;
import wu.business.Transactions;
import wu.business.CheckingAccount;

import java.util.Scanner;
/**
 * Created by Connie Wu on 2/19/2016.
 */
public class AccountApp {

    public static void print(Account a) {
        Console.displayLine("Checking: " + a.getBalanceFormatted());
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Account Calculator\n");

        CheckingAccount ca = new CheckingAccount();
        System.out.println("Starting Balance");
        print (ca);

        Scanner sc = new Scanner(System.in);
        String choice = "y";

         while (choice.equalsIgnoreCase("y")){

            System.out.print("\nWithdraw or deposit? (w/d): ");
            String wOd = sc.nextLine();

            if (wOd.equalsIgnoreCase("w")){

                double with = Console.getDouble("Amount: ");

                if (with > ca.getBalance())
                {
                    System.out.println("Cannot withdraw more than account balance");
                }
                else
                {
                    Transactions.withdraw(ca, with);
                }
            }
            else if (wOd.equalsIgnoreCase("d")){

                double dep = Console.getDouble("Amount: ");
                if (dep > 10000)
                {
                    System.out.println("You cannot deposit more than $10,000 per transaction.");
                }
                else{
                    Transactions.deposit(ca, dep);
                }

            }
            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
        }
        System.out.println("\nMonthly Fees \n" + "Checking fee:           " + ca.getMonthlyFeeFormatted());
        System.out.println();
        ca.subtractMonthlyFee();
        System.out.println("Final Balance");
        print(ca);

    }
}