package wu.business;

import wu.account.interfaces.Depositable;
import wu.account.interfaces.Withdrawable;

/**
 * Created by Connie Wu on 2/19/2016.
 */
public class Transactions {
    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }


}
