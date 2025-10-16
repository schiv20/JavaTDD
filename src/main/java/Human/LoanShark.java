package Human;

public class LoanShark extends Human {
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
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

    public double calculateYield(double currentAmount, int numOfYears){
        for(int i =0; i<numOfYears; i++){
            currentAmount =  currentAmount + (currentAmount * (this.interestRate/100));

        }
        return currentAmount;
    }
}
