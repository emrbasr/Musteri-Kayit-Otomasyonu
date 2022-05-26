package Adapters;

import Abstract.ICustomerCheckServis;
import Entitie.Customer;
import MernisReferance.TPUKPSPublicSoap;


public class MernisServiceAdapter implements ICustomerCheckServis {
    @Override
    public void CheckIfRealPerson(Customer customer) {
        TPUKPSPublicSoap tpukpsPublicSoap = new TPUKPSPublicSoap();
        return tpukpsPublicSoap.TCKimlikNoDogrula(Long.parseLong((customer.NationalltyId)),customer.firstName.toUpperCase(), customer.lastName, customer.DateOfBirth);
    }
}
