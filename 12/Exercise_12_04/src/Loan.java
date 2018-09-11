import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0)
            throw new IllegalArgumentException("The value not be 0 or less than 0");
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double monthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return monthlyPayment() * 12 * numberOfYears;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0 )
            throw new IllegalArgumentException("Annual interest rate not be 0 or less than 0");
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0 )
            throw new IllegalArgumentException("Number of years not be 0 or less than 0");
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        if ( loanAmount <= 0)
            throw new IllegalArgumentException("loan amount not be 0 or less than 0");
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
