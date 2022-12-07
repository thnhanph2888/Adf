package src.models.person;

import src.models.person.Person;

public class Customer extends Person {
     private String type;
     private String address;

     public Customer() {};
    public Customer(String code, String name, String dayOfBirth, String gender
            , String id, String phoneNumber, String email, String type, String address) {
        super(code, name, dayOfBirth, gender, id, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String getDataWrite() {
        return super.getDataWrite() +
                type + "," +
                address + "\n";
    }
}
