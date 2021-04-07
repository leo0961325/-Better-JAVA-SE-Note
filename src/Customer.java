public class Customer {




    private String firstName;
    private String lastName;
    private Integer zipCode;

    public Customer(String firstName, String lastName, Integer zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public String toString() {
        return String.format("Customer(%s %s, %d)", firstName, lastName, zipCode);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Integer getZipCode() { return zipCode; }









}
