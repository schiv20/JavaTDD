package Human;

import Interfaces.*;

public class Human implements ILovable {
    private String name;
    private int age;
    private String occupation;


    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Human(String name, int age, String occupation) {
        this(name, age);
        setOccupation(occupation);
    }


    public String getOccupation() {
        return occupation;
    }


    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void Love() {
        throw new NoContextForLoveException("There is no context to show this person any love");
    }
}
