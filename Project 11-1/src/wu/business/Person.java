package wu.business;

public abstract class Person {
    private String first;
    private String last;
    private String email;

    public Person(){
    }

    public String getFirst() { return first;}
    public String getLast() {return last;}
    public String getEmail() {return email;}

    @Override
    public String getDisplayText(){
        return super.toString()+ "Name: " + first + " " + last + "\n" + "Email " + email;
    }

}
