package Human;

import Interfaces.ILovable;

public class Footballer extends Human implements ILovable {



    public Footballer(String name, int age, String occupation) {
        super(name, age);
        setOccupation("Footballer");
    }

    public void Love(){
        System.out.println("Footballer does not care");
    }


}
