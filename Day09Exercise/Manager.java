/* T. Urness
 * CS 67
 */

public class Manager extends Employee {
    private double stipend;

    public Manager(String n, double salary, double stipend) {
        super(n, salary);
        this.stipend = stipend;
    }

    public double calculatePay() {
        return getBaseSalary() + stipend;
    }
}
