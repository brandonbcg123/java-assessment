public class Person implements Greeter {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName)
    {
        if (this.firstName == null || this.lastName == null) {
            throw new IllegalArgumentException("Both first name and last name should have a value");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String sayHello() {
           return "Hello" + this.firstName + this.lastName;
    }
}