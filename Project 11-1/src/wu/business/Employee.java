package wu.business;

public class Employee extends Person {

    private String ss;

    public Employee(){
        super();
        ss = "";
    }
    public void setSs(String ss){
        this.ss = ss;
    }
    public String getSs(){
        return ss;
    }
    public String getDisplayText(){
        return super.toString() + "\nSocial security number: "+ss;
    }
}