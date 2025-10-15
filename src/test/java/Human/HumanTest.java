package Human;

import Interfaces.NoContextForLoveException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human;

    @BeforeEach
    void setUp() {
        human = new Human("Retep", 20, "Lawnmower");
    }

    @Test
    void getOccupation() {
        assertEquals("Lawnmower", human.getOccupation());
//        assertNotEquals("Job", human.getOccupation());
    }

    @Test
    void setOccupation() {
        assertEquals("Lawnmower", human.getOccupation());
        human.setOccupation("Grasscutter");
        assertEquals("Grasscutter", human.getOccupation());
    }

    @Test
    void getName() {
        assertEquals("Retep", human.getName());
    }

    @Test
    void setName() {
        assertEquals("Retep", human.getName());
        human.setName("Peter");
        assertEquals("Peter", human.getName());

    }

    @Test
    void getAge() {
        assertEquals(20, human.getAge());
    }

    @Test
    void setAge() {
        assertEquals(20, human.getAge());
        human.setAge(30);
        assertEquals(30, human.getAge());

    }

    @Test
    void love() {
        assertThrows(NoContextForLoveException.class, () -> human.love());
    }


}