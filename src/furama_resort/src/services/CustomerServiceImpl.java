package src.services;

import src.models.person.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService{

    List<Customer> customerList = new LinkedList<>();
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void edit(int index, String code, String name, String dayOfBirth, String gender, String id, String phoneNumber, String email, String type, String address) {
        customerList.set(index, new Customer(code, name, dayOfBirth, gender, id, phoneNumber, email, type, address));
    }

    @Override
    public List<Customer> disPlayCustomer() {
        return customerList;
    }

    @Override
    public void remove(int index) {

    }
}
