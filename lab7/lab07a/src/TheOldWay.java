import java.util.Scanner;

/**
 * Program Description 
 * @author Program Author
 * @version 13.12.2020
*/ 
public class TheOldWay
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        int die1;
        int die2;
        int loopCounter;
        
        // Program Code
        //The old way
        //This n counts how many sixes have been thrown
        int n = 0;
        loopCounter = 0;
        //If two sixes are not thrown keep throwing.
        while (n < 1) {
            die1 = (int)((Math.random() * 6 ) + 1);
            die2 = (int)((Math.random() * 6 ) + 1);
            System.out.println(die1 + " , " + die2);
            loopCounter = loopCounter + 1;
           
            
            //If the current face of the dice is 6, add one to the
            if( die1 == 6 && die2 == 6){
                n = n + 1;
            }
        }
        System.out.println("It took " + loopCounter + " times to get 6,6.");
    
        scan.close();
    }
    
}