import java.util.Scanner;
public class Assignment3 
{

    private float assets; 
    private float debt;
    private float NetWorth;
    
    public Assignment3(float assets, float debt) 
    {
        this.assets = assets;
        this.debt = debt;
        this.NetWorth = assets - debt;
    }
    
    public void displayNetWorth()
    {
        System.out.println("Assets: " + assets);
        System.out.println("Debt: " + debt);
        System.out.println("Net Worth: " + NetWorth);

    }

    public float getAssets() 
    {
        return assets;
    }
    public float getDebt() 
    {
        return debt;

    }
    public float getNetWorth()
    {
        return NetWorth;
    }
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {

        System.out.println("Calculation " + i);

        System.out.print("Enter your assets: ");
        float assets = input.nextFloat();

        System.out.print("Enter your debt: ");
        float debt = input.nextFloat();

        Assignment3 worth = new Assignment3(assets, debt);
        worth.displayNetWorth();
        System.out.println();
    }
    input.close();
    }
}


