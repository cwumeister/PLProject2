package wu.business;

public class Customer extends Person{

    private String custnum;

    public Customer(){
        super();
        custnum = "";
    }

    public void setCustNum(String custnum){
        this.custnum = custnum;
    }
    public String getCustNum(){
        return custnum;
    }
    public String getDisplayText(){
        return toString() + "\nCustomer number: "+custnum;
    }

}
