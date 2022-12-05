package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    public boolean CheckIfRealPerson(Customer customer) {
        if(customer.nationalityId.length()==11){
            return true;
        }
        else{
            return false;
        }
    }
}
