package Human;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BabyTest {

    @Test
    void love() {
        Baby baby = new Baby("Panya", 25, "Clown", 100);
        assertEquals(100, baby.getCuteness());
        baby.love();
        assertEquals(101.5, baby.getCuteness());
        for(int i = 0; i<9; i++) baby.love();
        assertEquals(115, baby.getCuteness());

    }
}