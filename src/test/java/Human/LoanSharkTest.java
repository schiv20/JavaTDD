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
        int oldInterestRate = loanShark.getInterestRate();
        loanShark.love();
        int newInterestRate = loanShark.getInterestRate();
        assertEquals(oldInterestRate, newInterestRate);

    }
}