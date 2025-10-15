package Buildings;

import Interfaces.ILovable;

public class Casino extends Building {

//    @Override
//    public String toString() {
//        return "Casino | SQFT: %d | FLOORS: %n | JACKPOT: %n;
//    }

    public Casino(float sqft, int numOfFloors, float jackpot) {
        super(sqft, numOfFloors);
        setJackpot(jackpot);

    }

    @Override
    public void enterBuilding() {
        System.out.println("You have LOST money!");
    }

    @Override
    public void Love() {
        setJackpot(getJackpot()*1.1f);
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
