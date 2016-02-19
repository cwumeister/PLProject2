package wu.business;

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
        double newMonFee = super.getBalance() - monthlyFee;

    }

    public void setMonthlyFee(double monthlyFee){this.monthlyFee = monthlyFee;}
    public double getMonthlyFee(){return monthlyFee;}

    public String getMonthlyFeeFormatted(){
        String getMonthlyFeeFormatted = String.valueOf(monthlyFee);

        return getMonthlyFeeFormatted;
    }

}
