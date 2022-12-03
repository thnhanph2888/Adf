package src.models.facility;

import src.models.facility.Facility;

public class Room extends Facility {
    private String standard;
    private String sizeSwimmingPool;
    private int numberOfFloors;

    public Room(String name, int area, int price, int capacity, String rentalType, String standard, String sizeSwimmingPool, int numberOfFloors) {
        super(name, area, price, capacity, rentalType);
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

    public String getSizeSwimmingPool() {
        return sizeSwimmingPool;
    }

    public void setSizeSwimmingPool(String sizeSwimmingPool) {
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
