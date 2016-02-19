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
        System.out.println("Welcome to the Account Calculator");
        System.out.println();

        Account a = new Account();
        System.out.println("Starting Balance");
        print (a);

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        CheckingAccount c = new CheckingAccount();

         while (choice.equalsIgnoreCase("y")){

            System.out.print("\nWithdraw or deposit? (w/d): ");
            String wOd = sc.nextLine();

            if (wOd.equalsIgnoreCase("w")){

                double with = Console.getDouble("Amount: ");

                if (with > a.getBalance())
                {
                    System.out.println("Cannot withdraw more than account balance");
                }

                else
                {
                    double neww = a.getBalance() - with;
                    a.setBalance(neww);
                }


            }
            else if (wOd.equalsIgnoreCase("d")){

                double dep = Console.getDouble("Amount: ");
                if (dep > 10000)
                {
                    System.out.println("You cannot deposit more than $10,000 per transaction.");
                }
                else{
                    double old = a.getBalance() + dep;
                    a.setBalance(old);
                }

            }

            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }
        double endBal = a.getBalance() - 1;
        System.out.println("Monthly Fees \n" + "Checking fee:               " + c.getMonthlyFeeFormatted());
        System.out.println();
        System.out.println("Final Balance\n" + "Checking: " + "$" + endBal);

    }
}