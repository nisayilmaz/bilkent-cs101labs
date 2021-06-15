import java.util.Scanner;

/**
 * A simple calculator, which has the 4 operation (+,-,*,/), the clear option and the quit option. 
 * @author Nisa Yılmaz
 * @version 23.11.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Variables
        double currentValue;
        String operation;
        double input;
       
        // Program Code
        currentValue = 0.0;
        do{ 
            //Show the user the operation list and ask & get input from user.
            System.out.println( "Hello, welcome to simplecalculator. ");
            System.out.println("------------------------");
            System.out.println( "["+ currentValue + "]");
            System.out.println("------------------------");
            System.out.println( "Enter one of the operations below.");
            System.out.println( "+,-,*,/ value ");
            System.out.println( "Clear");
            System.out.println( "Quit");
            System.out.println("------------------------");
            System.out.print( "Select: ");
            operation = scan.next();
            
            //If the user enters "q", "Q" or "quit" the program stops and prints a goodbye message.
            if ( operation.equals( "q") || operation.equals( "Q") || operation.equals( "quit")) {
                System.out.println( "Goodbye, thanks for using simplecalculator.");
            }
            //If the user enters"c", "C" or "clear" thecurrent value is set to 0.0.
            if ( operation.equals( "C") || operation.equals( "c") || operation.equals( "clear")) {
                currentValue = 0;
            }
            //If the user enters (+,-,*,/) and a number, does math accordingly to the current value.
            else{
                input = scan.nextDouble();
                
                if ( operation.equals("+")) {
                currentValue = currentValue + input; 
                }
                else if ( operation.equals("-")) {
                currentValue = currentValue - input; 
                }
                else if ( operation.equals("*")) {
                    currentValue = currentValue * input; 
                }
                else if ( operation.equals("/")) {
                    currentValue = currentValue / input; 
                }
                else {
                    System.out.println( "Unknown command");
                }
                //Shows the current value to the user.
                System.out.println("------------------------");
                System.out.println("Current value: " + currentValue);
                System.out.println("------------------------");
            }
            
        //Program doesn't stop unless the user uses the quit command.    
        } while( !(operation.equals( "N")) || !(operation.equals( "n")) || !(operation.equals( "no")));
        scan.close();
    
       
       
        
    }
    
}