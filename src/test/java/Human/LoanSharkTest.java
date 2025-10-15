package Human;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanSharkTest {

    LoanShark loanShark = new LoanShark("Beer Bryan", 40);

    @Test
    void getInterestRate() {
        assertEquals(200, loanShark.getInterestRate());
    }

    @Test
    void love() {
        double oldInterestRate = loanShark.getInterestRate();
        loanShark.love();
        double newInterestRate = loanShark.getInterestRate();
        assertEquals(oldInterestRate, newInterestRate);

    }

    @Test
    void testCalculateYield() {
        double yield = loanShark.calculateYield(100.00, 10);
        assertEquals(5904900, yield);
    }
}