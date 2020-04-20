package lab4;


public class Person implements EmailRecipient  {
    private String firstName;
    private String lastName;
    private String emailAddress; //do zadania nr 2
    
    public Person(String firstName, String lastName, /* do zad 2*/String emailAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAdress; //do zad 2
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    
    public String getEmailAddress() {
       return this.emailAddress;
    }
}

