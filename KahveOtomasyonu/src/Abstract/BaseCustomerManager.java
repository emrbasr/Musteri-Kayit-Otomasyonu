package Abstract;

import Entitie.Customer;

public abstract class BaseCustomerManager implements ICustomer{
    @Override
    public void save(Customer customer) {
        System.out.println("SAve to database : "+ customer.firstName);
    }
}
