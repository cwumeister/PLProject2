package wu.business;

public abstract class Person {

    private String first;
    private String last;
    private String email;

    public Person(){}

    public void setFirst(String first){
        this.first = first;
    }
    public String getFirst() {
        return first;
    }
    public void setLast(String last){
        this.last = last;
    }
    public String getLast() {
        return last;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){return "Name: "+first+" "+last+"\nEmail: "+email;}
    public abstract String getDisplayText();

}
