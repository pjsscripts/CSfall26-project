/* T. Urness
 * CS 67
 */

public class PayrollDriver {

    public static void main(String[] args) {
        Employee staff = new Employee("Sue", 50000.0);
        Manager mgr = new Manager("Gus", 65000.0, 8000.0);
        Contractor contractor = new Contractor("Peter", 75.0, 160);

        System.out.println("--- (calculatePay) ---");
        System.out.println(staff);
        System.out.println(mgr);
        System.out.println(contractor);

        System.out.println("\n--- (applyBonus) ---");
        System.out.println(mgr.getName() + " with default bonus:    $" + mgr.applyBonus());
        System.out.println(mgr.getName() + " with 10% bonus:        $" + mgr.applyBonus(0.10));
        System.out.println(mgr.getName() + " with \"high\" tier bonus: $" + mgr.applyBonus("high"));
    }
}
