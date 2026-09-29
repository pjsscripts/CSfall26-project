import java.io.*;
import java.util.Random;
public class FileWriterTest
{
    public static void main(string[] args) throws IOexception 
    {
        int number;
        Random randomNumbers = new Random();
        number = randomNumbers.nextInt();
    
        PrintWriter outputfile = new PrinterWriter("Numbers.txt");
        outputFile.println(number);
        outputFile.close();
    }
}