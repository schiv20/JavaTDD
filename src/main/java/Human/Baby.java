package Human;

public class Baby extends Human {

    double cuteness;


    public Baby(String name, int age, double cuteness) {
        super(name, age);
        this.cuteness = cuteness;
        setOccupation("Unemployed");
    }



}
