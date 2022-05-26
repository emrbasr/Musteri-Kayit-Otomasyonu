package Concrate;


import Abstract.ICustomerCheckServis;
import Entitie.Customer;

public class CustomerCheckManager implements ICustomerCheckServis {


    @Override
    public void CheckIfRealPerson(Customer customer) {
        return true;

    }
}
