package Human;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


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

    @ParameterizedTest
    @CsvSource({"9000.00, 1000.00, 2", "243.00, 1.00, 5", "358722650.00, 50.00, 50"})
    @DisplayName("Test different investments")
    void testCalculateYield(double expectedAmount, double currentAmount, int numOfYears) {
        assertEquals(expectedAmount, loanShark.calculateYield(currentAmount, numOfYears));
    }
}