package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    public void Save(Customer customer) {
        super.Save(customer);
    }
}
