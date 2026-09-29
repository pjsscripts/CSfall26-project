import java.util.Scanner;

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        

        System.out.println("how many people are eating?");
        int numPeople = keyboard.nextInt();

        System.out.println("how much did the meal cost?");
        double mealCost = keyboard.nextInt();

        double tax = mealCost * 0.15;
        double totalPerPerson = (mealCost + tax) / numPeople;

        System.out.println("each person should pay, " + 4totalPerPerson);

    }
}