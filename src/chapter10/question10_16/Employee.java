package chapter10.question10_16;

public abstract class Employee implements Payable{

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

    public abstract double earnings();

    @Override
    public String toString(){
        return String.format("First Name: %s%nLast Name: %s%nSSN: %s",getFirstName(),getLastName(),getSocialSecurityNumber());
    }

    public double getPaymentAmount(){
        return earnings();
    }
}
