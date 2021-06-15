import java.util.Scanner;

/**
 * This program asks the user for 2 values than calculates their sum, difference,product,division and the remainder of that division. 
 * @author Nisa Yılmaz
 * @version 26.10.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        
        // Variables 
        int firstValue;
        int secondValue;
        double sum;
        double product;
        double difference;
        double quotient;
        double remainder;
               
        
        // Ask and get the first value from the user.
        System.out.println("Hello, please enter a number and press enter.");
        firstValue = scan.nextInt();
        // Ask and get the second value from the user.
        System.out.println("Now enter a second value and press enter again.");
        secondValue = scan.nextInt();
        // Find the sum of the values the user has entered.
        sum = (double)(firstValue + secondValue);
        // Find the difference of the values the user has entered.
        difference = (double)(firstValue - secondValue);
        // Find the product of the values the user has entered.
        product= (double)(firstValue * secondValue);
        // Find the quoitent of the values the user has entered.
        quotient = (double)(firstValue / secondValue);
        // Find the remainder of the division.
        remainder= (double)(firstValue % secondValue);
        
        
        //Print the values you have found.
        System.out.println("This is the sum of the two values you entered: " + sum);
        System.out.println("And this is the difference: " + difference);
        System.out.println("If you want the product, this is what you get: " + product);
        System.out.println("And if you want to divide the first value by the second you get: " +quotient);
        System.out.println("And this is the remainder when you do the division:" + remainder);
        System.out.println("This is the max:" + Math.max(firstValue,secondValue));
        System.out.println("This is the min:" + Math.min(firstValue,secondValue));
        
        
        
        
        
    }
    
}