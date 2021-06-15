import java.util.Scanner;


public class App
{
    public static void main(String[] args)
    {
        double d;
        d = 0.1;
        // while ( d != 1.0 ) if we leave it this way it will create an infinite loop because d will never be 1
        while (d < 1) 
        {
           System.out.println( d);
           d = d + 0.1;
        }
        System.out.println( d + " <- final value after loop!");
    }
    
}