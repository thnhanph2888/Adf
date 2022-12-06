package src.models.facility;

import java.util.Objects;

public abstract class Facility {

     private String code;
     private String name;
     private int area;
     private int price;
     private int capacity;
     private String rentalType;

     protected Facility(String code, String name, int area, int price, int capacity, String rentalType) {
          this.code = code;
          this.name = name;
          this.area = area;
          this.price = price;
          this.capacity = capacity;
          this.rentalType = rentalType;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getArea() {
          return area;
     }

     public void setArea(int area) {
          this.area = area;
     }

     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     public int getCapacity() {
          return capacity;
     }

     public void setCapacity(int capacity) {
          this.capacity = capacity;
     }

     public String getRentalType() {
          return rentalType;
     }

     public void setRentalType(String rentalType) {
          this.rentalType = rentalType;
     }

     public String getCode() {
          return code;
     }

     public void setCode(String code) {
          this.code = code;
     }

     @Override
     public String toString() {
          return  "code=" + code +
                  "name='" + name + '\'' +
                  ", area=" + area +
                  ", price=" + price +
                  ", capacity=" + capacity +
                  ", rentalType='" + rentalType + '\'';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Facility facility = (Facility) o;
          return Objects.equals(code, facility.code);
     }

     @Override
     public int hashCode() {
          return Objects.hash(code);
     }
}
