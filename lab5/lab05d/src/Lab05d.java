import java.util.Scanner;

/**
 * Calculates pi with a specific series.
 * @author Nisa Yılmaz
 * @version 23.11.2020
*/ 
public class Lab05d
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
     
        
        // Variables
        int i;
        double division;
        int input;
        double firstValue;
        double secondValue;
        int oddNumber;
        double error;
        int loopcounter;
        
        
       
        // Program Code
        //Ask andd get number of term from the user.
        System.out.println( "Please enter for how many terms of the series you want to calculate pi for?");
        input = scan.nextInt();
        oddNumber = 1;
        firstValue = 0;
        System.out.println( "Please enter the error: ");
        error = scan.nextDouble();
        
        for (i = 1; i <= input; i++) {
            
            division = (4.0 / oddNumber); 
            
            //If the term is an odd term(the first, the third) it is added to the total.
            if ( !(i % 2 == 0)) {
                
                firstValue = firstValue + division; 
                                
            }
            //If the term is an even term(the second, the fourth) it is subtracted from the total.
            else{
                firstValue = firstValue - division;
                
            }
            //Calculates the odd numbers from 1 to user specified term.
            oddNumber = oddNumber + 2;
        }
        System.out.println( "If we calculate pi with the infinite series we find: " + firstValue);
        System.out.println( "If we use the vscode constant we find: " + Math.PI);
        
        secondValue = 0;
        oddNumber = 1;
        loopcounter = 0;
        //Works while the error is bigger than the user specified error.
        while( (Math.abs( Math.PI - secondValue)) > error) {
            
            division = (4.0 / oddNumber); 
            
            //If the term is an even term(the second, the fourth) it is added to the total.
            if ( loopcounter % 2 == 0) {
                
                secondValue = secondValue + division; 
                                
            }
            //If the term is an odd term(the first, the third) it is subtracted from the total.
            else{
                secondValue = secondValue - division;
                
            }
            //Calculates the odd numbers from 1 to user specified term.
            oddNumber = oddNumber + 2;
            //Counts the loop.
            loopcounter = loopcounter + 1;
                          
        }
        System.out.println( "And we find " + secondValue + " given that the error was " + error + ".");
        
        scan.close();
    }
    
}