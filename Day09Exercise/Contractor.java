/* T. Urness
 * CS 67
 */

public class Contractor extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String n, double hourlyRate, int hoursWorked) {
        super(n, 0.0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
