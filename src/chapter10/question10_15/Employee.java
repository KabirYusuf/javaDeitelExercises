package chapter10.question10_15;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;



    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%nFirst Name: %s%nLast Name: %s%nSSN: %s%n",getFirstName(),getLastName(),getSocialSecurityNumber());
    }


    public abstract double earnings();
}
