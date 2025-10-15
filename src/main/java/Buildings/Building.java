package Buildings;

import Interfaces.ILovable;

public abstract class Building implements ILovable {

    public abstract void enterBuilding();

    public Building(String name, float sqft, int numOfFloors) {
        setName(name);
        setSqft(sqft);
        setNumOfFloors(numOfFloors);
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public float getSqft() {
        return sqft;
    }

    public void setSqft(float sqft) {
        this.sqft = sqft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int numOfFloors;
    private float sqft;

}
