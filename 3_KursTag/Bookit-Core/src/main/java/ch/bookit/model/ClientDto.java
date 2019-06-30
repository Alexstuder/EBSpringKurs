package ch.bookit.model;

public class ClientDto {


    private String firstName ;
    private String lastName;
    private String street ;
    private String town ;


 /*   public ClientDto() {

        // Get a fresh initialized empty Client
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.town = "";
    }*/

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
