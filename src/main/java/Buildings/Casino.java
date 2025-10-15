package Buildings;

import Interfaces.ILovable;

public class Casino extends Building {

    @Override
    public String toString() {
        return String.format("%s | SQFT: %.2f | FLOORS: %d | JACKPOT: %.2f", getName(), getSqft(), getNumOfFloors(), getJackpot());
    }

    public Casino(String name, float sqft, int numOfFloors, float jackpot) {
        super(name, sqft, numOfFloors);
        setJackpot(jackpot);

    }

    @Override
    public void enterBuilding() {
        System.out.println("You have LOST money!");
    }

    @Override
    public void love() {
        setJackpot(getJackpot()+1);
        System.out.println("The NEW jackpot is " + getJackpot() + "! WOW!!!");
    }

    private float jackpot;

    public float getJackpot() {
        return jackpot;
    }

    public void setJackpot(float jackpot) {
        this.jackpot = jackpot;
    }
}
