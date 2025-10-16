package Buildings;

import Interfaces.ILovable;

import java.util.Random;



public class Casino extends Building {

    private final float CASINO_TAX = 0.9f;

    @Override
    public String toString() {
        return String.format("%s | SQFT: %.2f | FLOORS: %d | JACKPOT: %.2f", getName(), getSqft(), getNumOfFloors(), getJackpot());
    }

    public Casino(String name, float sqft, int numOfFloors, float jackpot) {
        super(name, sqft, numOfFloors);
        setJackpot(jackpot);
        random = new Random();
    }

    public Casino(String name, float sqft, int numOfFloors, float jackpot, Random random) {
        this(name, sqft, numOfFloors, jackpot);
        this.random = random;
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

    public void setRandom(Random random) {
        this.random = random;
    }

    private Random random;

    public float getJackpot() {
        return jackpot;
    }

    public void setJackpot(float jackpot) {
        this.jackpot = jackpot;
    }

    public float gamble(float bet) {
        if (bet <= 0) {
            return 0f; // Invalid bet
        }

        float chanceToWin = (bet == jackpot) ? 0.5f : bet / jackpot;

        chanceToWin = Math.min(chanceToWin, 1.0f); // Cap at 100%

        float roll = random.nextFloat(); // Random float between 0.0 and 1.0

        if (roll < chanceToWin) {
            float payoutMultiplier = 1 / chanceToWin;
            float prize = bet * payoutMultiplier * CASINO_TAX;
            return prize;
        } else {
            return 0f;
        }
    }

}

