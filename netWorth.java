import java.util.Scanner;

public class netWorth {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your total assets?");
        double assets = keyboard.nextInt();
        System.out.println("What are your total liabilities?");
        double liabilities = keyboard.nextInt();
        double netWorth = assets - liabilities;
        System.out.println("Your networth is " + netWorth);
        
        
    }
}