import java.util.


public class FuncTest {
    public static void printMultiple(String str, int num)
    {
        for(int i=0; i<num; i++)
        {
            System.out.println(str);
        }
    } 



    public static void main(String[] args)
    {
        printMultiple("Hello, World!", 5);
    }
}
