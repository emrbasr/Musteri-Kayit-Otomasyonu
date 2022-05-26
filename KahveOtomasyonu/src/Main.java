import Abstract.BaseCustomerManager;
import Concrate.NeroCustomerManager;
import Entitie.Customer;
import MernisReferance.TPUKPSPublicSoap;

public class Main {

    public static void main(String[] args) {



        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer("Emre","Başar",1997,62338250762));




    }
}
