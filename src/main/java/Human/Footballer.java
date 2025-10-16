package Human;

import Interfaces.ILovable;

public class Footballer extends Human  {

    public Footballer(String name, int age) {
        super(name, age);
        setOccupation("Footballer");
    }

    public void love(){
        System.out.println("Footballer does not care");
    }


}
