public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Loan loan = new Loan(1, 2, 7);
            loan.setNumberOfYears(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
