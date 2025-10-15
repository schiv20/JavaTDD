package Human;

import Interfaces.ILovable;

public class Baby extends Human  {
    double cuteness;

    public double getCuteness() {
        return cuteness;
    }

    public Baby(String name, int age, String occupation, double cuteness) {
        super(name, age);
        this.cuteness = cuteness;
        setOccupation("Unemployed");
    }

    public void love(){
        System.out.println("Baby feels cuter");
        cuteness += 1.5;
        System.out.println("Cuteness: " + cuteness);
    }


}
