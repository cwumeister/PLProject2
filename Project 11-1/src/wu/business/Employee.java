package wu.business;

public class Employee extends Person {

    private String ss;

    public Employee(){
        super();
        ss = "";
    }

    public void setSs(String social){this.ss = ss;}
    public String getSs(){return ss;}

    public String getDisplayText(){return super.toString() + "Social security: "+ss; }

}