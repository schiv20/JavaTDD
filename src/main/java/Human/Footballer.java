package Human;

import Interfaces.ILovable;

public class Footballer extends Human  {

    public Footballer(String name, int age, String occupation) {
        super(name, age, occupation);
        setOccupation("Footballer");
    }

    public void love(){
        System.out.println("Footballer does not care");
    }


}
