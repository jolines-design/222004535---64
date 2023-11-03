public class SimpleInterest {
    private double principalAmount; // The principal amount deposited into the bank
    private double interestRate; // The annual interest rate
    private int timeInYears; // The time in years that the money is deposited for

    public SimpleInterest(double principalAmount, double interestRate, int timeInYears) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.timeInYears = timeInYears;
    }

    public double computeSimpleInterest() {
        double simpleInterest = (principalAmount * interestRate * timeInYears) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Create a new SimpleInterest object
        SimpleInterest simpleInterest = new SimpleInterest(100000, 5, 5);

        // Compute the simple interest
        double simpleInterestAmount = simpleInterest.computeSimpleInterest();

        // Print the simple interest amount to the console
        System.out.println("The simple interest for Mr. Bob is: " + simpleInterestAmount + " RWF");
    }
}
