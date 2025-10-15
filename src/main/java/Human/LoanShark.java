package Human;

import Interfaces.ILovable;

public class LoanShark extends Human implements ILovable {
    private int interestRate;

    public int getInterestRate() {
        return interestRate;
    }

    public LoanShark(String name, int age, String occupation) {
        super(name, age);
        setOccupation("Loan Shark ");
        this.interestRate = 200;
    }

    public void Love(){
        System.out.println("Interest rate decreases too " + this.interestRate);
    }
}
