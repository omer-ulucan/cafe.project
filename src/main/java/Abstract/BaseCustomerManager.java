package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

    public void Save(Customer customer) {
        System.out.println("Saved to DB : "+customer.firstName);
    }
    public void Delete(Customer customer) {
        System.out.println("Following customer is deleted from db: " + customer.firstName + " " + customer.lastName );
    }
    public void StarPoint(Customer customer) {
        System.out.println(customer.firstName + " " + customer.lastName + " Earned a '*' ");
    }
}
