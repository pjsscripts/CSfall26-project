/* T. Urness
 * CS 67
 * Real-world demo of overloading vs. overriding
 */

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String n, double salary) {
        name = n;
        baseSalary = salary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public double applyBonus() {
        // flat default bonus
        return calculatePay() + 500.0;
    }

    public double applyBonus(double percentage) {
        // percentage-based bonus, e.g. 0.10 for 10%
        return calculatePay() + (calculatePay() * percentage);
    }

    public double applyBonus(String tier) {
        // tier-based bonus
        double bonus = tier.equalsIgnoreCase("high") ? 2000.0 : 750.0;
        return calculatePay() + bonus;
    }

    public String toString() {
        return name + " earns $" + calculatePay();
    }
}
