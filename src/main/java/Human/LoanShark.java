package Human;

public class LoanShark extends Human {
    private int interestRate;

    public int getInterestRate() {
        return interestRate;
    }

    public LoanShark(String name, int age) {
        super(name, age);
        setOccupation("Loan Shark");
        this.interestRate = 200;
    }

    public void love(){
        System.out.println("Interest rate decreases to " + this.interestRate);
    }
}
