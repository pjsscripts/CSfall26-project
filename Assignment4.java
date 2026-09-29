/* 
Secret Code 1: EatMoreVegetables
Secret Code 2: FourCharsAfterW
Secret Code 3: tinyurl.com/3s847myv

*/




import java.io.*;
import java.util.Scanner;

public class Assignment4 
{
    public static void main(String[] args) throws IOException 
    {

        File myFile = new File("Assignment4input.txt");
        Scanner inputFile = new Scanner(myFile);

        StringBuilder fullString = new StringBuilder();
        while (inputFile.hasNextLine()) {
            fullString.append(inputFile.nextLine());
        }
        inputFile.close();

        String text = fullString.toString();

        String secretCode1 = extractMessage(text, 'X', 3);
        System.out.println("Secret Code 1: " + secretCode1);

        String secretCode2 = extractMessage(text, 'Y', 5);
        System.out.println("Secret Code 2: " + secretCode2);

        String secretCode3 = extractMessage(text, 'W', 4);
        System.out.println("Secret Code 3: " + secretCode3);
        /* 
        if (secretCode2.length() >= 2) {
            char targetChar = secretCode2.charAt(0);
            int offset = Integer.parseInt(secretCode2.substring(1).trim());
        }
*/
    }
    public static String extractMessage(String text, char targetChar, int offset)
{
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < text.length(); i++)
    {
        if (text.charAt(i) == targetChar && i + offset < text.length())
        {
            result.append(text.charAt(i + offset));
        }
    }

    return result.toString();
}
}


