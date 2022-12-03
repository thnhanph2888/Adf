package src.services;

import src.models.person.Customer;

public interface ICustomerService extends IService{
    void add(int index, Customer employee);

    void edit(int index, String code, String name, String dayOfBirth, String gender
            , String id, String phoneNumber, String email, String type, String address);
}
