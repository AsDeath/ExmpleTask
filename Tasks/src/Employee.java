

public class Employee extends Date{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(int month, int day, int year, String firstName, String lastName, String socialSecurityNumber) {
        super(month, day, year);
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
    public String toString() {
        return "Employee{ " +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", BirthDay='"+super.toString()+"\'"+" }\n";
    }
}