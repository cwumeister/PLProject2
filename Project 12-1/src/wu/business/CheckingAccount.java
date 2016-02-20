package wu.business;

import java.text.NumberFormat;

/**
 * Created by Connie Wu on 2/19/2016.
 */
public class CheckingAccount extends Account {

    private double monthlyFee;

    public CheckingAccount(){
        super();
        monthlyFee = 1.00;
    }
    public void subtractMonthlyFee(){
        setBalance(getBalance()-1);
    }
    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }
    public double getMonthlyFee(){
        return monthlyFee;
    }
    public String getMonthlyFeeFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(monthlyFee);
    }

}
