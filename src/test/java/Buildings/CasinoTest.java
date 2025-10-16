package Buildings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Random;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(CasinoParameterResolver.class)
class CasinoTest {

    @Test
    @DisplayName("Winning a gamble")
    void gambleWin(Casino casino) {

        Random mockRandom = Mockito.mock(Random.class);
        casino.setRandom(mockRandom);
        when(mockRandom.nextFloat()).thenReturn(0f);

        assertEquals(900000000, casino.gamble(1));
    }

    @Test
    @DisplayName("Losing a gamble")
    void gambleLose(Casino casino) {

        Random mockRandom = Mockito.mock(Random.class);
        casino.setRandom(mockRandom);
        when(mockRandom.nextFloat()).thenReturn(1f);

        assertEquals(0, casino.gamble(1234567890));
    }
}