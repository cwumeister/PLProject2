package wu.business;
import wu.account.interfaces.Balanceable;
import wu.account.interfaces.Depositable;
import wu.account.interfaces.Withdrawable;

import java.text.NumberFormat;

/**
 * Created by Connie Wu on 2/19/2016.
 */
public class Account implements Depositable, Withdrawable, Balanceable {
    private double deposit;
    private double withdraw;
    private double balance;

    public Account(){}

    public void deposit(double deposit){
        this.deposit = deposit;}

    public double getDeposit(){return deposit;}

    public void withdraw(double withdraw){
        this.withdraw = withdraw;}
    public double getWithdraw(){return withdraw;}

    public void setBalance(double balanace){
        this.balance = balance;}
    public double getBalance(){return balance;}

    public String getBalanceFormatted(){
        NumberFormat balance = NumberFormat.getCurrencyInstance();
        return balance.format(balance);

    }
}