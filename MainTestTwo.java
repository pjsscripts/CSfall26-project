import java.util.Scanner;

public class MainTestTwo
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num = 7;
        int newNum = 0;
        while (num != newNum)
        {
            System.out.println("enter a number");
            newNum = keyboard.nextInt();
        }
    }

}