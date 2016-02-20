package wu.business;
import wu.account.interfaces.Balanceable;
import wu.account.interfaces.Depositable;
import wu.account.interfaces.Withdrawable;
import java.text.NumberFormat;
/**
 * Created by Connie Wu on 2/19/2016
 */

public class Account implements Depositable, Withdrawable, Balanceable {
    private double balance;

    public Account(){
        balance = 1000;
    }

    public void deposit(double deposit){
        balance+=deposit;
    }
    public void withdraw(double withdraw){
        balance-=withdraw;
    }
    public void setBalance(double balance){
        this.balance = balance;}

    public double getBalance(){
        return balance;
    }

    public String getBalanceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(balance);
    }
}