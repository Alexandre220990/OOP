package labsheet6.exercise1;

public class person {
    private String firstName;
    private String lastName;

    public person(){
        firstName="Not Supplied";
        lastName="Not Supplied";
    }
    public person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String toString(){
        return "Value of the first person is:\n"+
                "First name: "+ getFirstName() + "\n" +
                "Last Name: "+ getLastName();
    }
    public void setName(String firstName,String lastName){

    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
       return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
