package src.services;

import src.models.person.Customer;

import java.util.List;

public interface ICustomerService extends IService{
    void add(Customer employee);

    void edit(int index, String code, String name, String dayOfBirth, String gender
            , String id, String phoneNumber, String email, String type, String address);

    List<Customer> disPlayCustomer();
}
