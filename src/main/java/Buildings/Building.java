package Buildings;

import Interfaces.ILovable;

public abstract class Building implements ILovable {

    public abstract void enterBuilding();

    public Building(float sqft, int numOfFloors) {
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

    private int numOfFloors;
    private float sqft;

}
