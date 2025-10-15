package Human;

import static org.junit.jupiter.api.Assertions.*;

class LoanSharkTest {

    LoanShark loanShark = new LoanShark("Beer Bryan", 40);

    @org.junit.jupiter.api.Test
    void getInterestRate() {
        assertEquals(200, loanShark.getInterestRate());
    }

    @org.junit.jupiter.api.Test
    void love() {
        int oldInterestRate = loanShark.getInterestRate();
        loanShark.Love();
        int newInterestRate = loanShark.getInterestRate();
        assertEquals(oldInterestRate, newInterestRate);

    }
}