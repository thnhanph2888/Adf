package src.models.facility;

import src.models.facility.Facility;

public class Room extends Facility {
    private String standard;
    private int sizeSwimmingPool;
    private int numberOfFloors;

    public Room(String code,String name, int area, int price, int capacity, String rentalType, String standard, int sizeSwimmingPool, int numberOfFloors) {
        super(code ,name, area, price, capacity, rentalType);
        this.standard = standard;
        this.sizeSwimmingPool = sizeSwimmingPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getSizeSwimmingPool() {
        return sizeSwimmingPool;
    }

    public void setSizeSwimmingPool(int sizeSwimmingPool) {
        this.sizeSwimmingPool = sizeSwimmingPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "standard='" + standard + '\'' +
                ", sizeSwimmingPool='" + sizeSwimmingPool + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
