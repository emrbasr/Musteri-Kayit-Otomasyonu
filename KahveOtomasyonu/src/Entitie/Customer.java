package Entitie;

import Abstract.ICustomer;

public class Customer implements ICustomer {



    public String firstName;
    public String lastName;
    public int DateOfBirth;
    public String NationalltyId;



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

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalltyId() {
        return NationalltyId;
    }

    public void setNationalltyId(String nationalltyId) {
        NationalltyId = nationalltyId;
    }



    public Customer( String firstName, String lastName, int dateOfBirth, String nationalltyId) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.DateOfBirth= dateOfBirth;
        this.NationalltyId = nationalltyId;
    }







    @Override
    public void save(Customer customer) {

    }
}
