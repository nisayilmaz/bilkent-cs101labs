import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 *   
 * @author Program Author
 * @version 17.11.2020
*/ 
public class Lab04e
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner( new File( "src/testdata.txt") );
        
        // Constants
        final int NUMBER_OF_VALUES = 1000;
        
        // Variables
        int currentNumber;
        int loopCounter;
        int sum;
        double average;
        int maxValue;
        int minValue;
        
        // Program Code
        loopCounter = 0;
        sum = 0;
        minValue = 100;
        maxValue = -1;
        //This while loops read from the txt file "testdata". Finds the sum of the values read.
        while ( loopCounter < NUMBER_OF_VALUES && dataInputFile.hasNext()) { 
            currentNumber = dataInputFile.nextInt();
            sum = sum + currentNumber;
            loopCounter = loopCounter + 1;
            // To determine the max value, if the current number is bigger than the minumum that the random value can take, it is the new max. For the min value, the same applies.
            if ( currentNumber > maxValue) {
                maxValue = currentNumber;
                }
            if (currentNumber < minValue) {
                minValue = currentNumber;
            }
                     
        }
        //If the file "testdata" has enough NUMBER_OF_VALUES, the program outputs the sum and average. If not, gives an error.
        if (loopCounter == NUMBER_OF_VALUES) {
            System.out.println( "The sum of the first " + NUMBER_OF_VALUES + " is " + sum + " ." );  
            average = (double)sum / (double)NUMBER_OF_VALUES;
            System.out.println( "Average is " + average + " .");
            
        }
        else{
            System.out.println("Not enough values");
        } 
          
        System.out.println( "Min value is " + minValue);
        System.out.println( "Max value is " + maxValue);
        
        
     
        dataInputFile.close();
        scan.close();
    }
}
