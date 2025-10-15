package Human;

public class Human {
    private String name;
    private int age;
    private String occupation;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
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
}
