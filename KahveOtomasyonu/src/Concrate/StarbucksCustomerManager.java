package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckServis;
import Entitie.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckServis iCustomerCheckServis;

    public StarbucksCustomerManager(ICustomerCheckServis iCustomerCheckServis) {
        this.iCustomerCheckServis = iCustomerCheckServis;
    }



    @Override

    public void save(Customer customer) {
        if(iCustomerCheckServis.CheckIfRealPerson(customer)) {
            super.save(customer);
        }else {
            System.out.println("not a valid person");
        }

    }
}
