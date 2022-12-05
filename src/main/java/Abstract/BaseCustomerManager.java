package Abstract;

import Abstract.ICustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("Saved to db : " + customer.id + "-" + customer.firstName + " " + customer.lastName + " " + customer.dateOfBirth );
        StarPoint(customer);
    }

    @Override
    public void Delete(Customer customer) {
        System.out.println("Customer id : " + customer.id + " -> Deleted to db" );
    }

    @Override
    public void StarPoint(Customer customer) {
        System.out.println(customer.firstName + " " + customer.lastName + " Earned a '*' ");
    }
}
