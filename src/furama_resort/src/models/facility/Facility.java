package src.models.facility;

public abstract class Facility {
     private String name;
     private int area;
     private int price;
     private int capacity;
     private String rentalType;

     public Facility(String name, int area, int price, int capacity, String rentalType) {
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

     @Override
     public String toString() {
          return  "name='" + name + '\'' +
                  ", area=" + area +
                  ", price=" + price +
                  ", capacity=" + capacity +
                  ", rentalType='" + rentalType + '\'';
     }
}
