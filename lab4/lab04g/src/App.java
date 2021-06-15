import java.util.Scanner;
import java.io.File;


/**
 *   
 * @author Program Author
 * @version 17.11.2020
*/ 
public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner( new File( "src/testdata.txt") );
        
            
        // Variables
        int currentNumber;
        int sum;
        double average;
        int maxValue;
        int minValue;
        int numberOfValues;
        boolean encounteredNegativeValue;
        
        // Program Code
        sum = 0;
        numberOfValues = 0;
        minValue = 50;
        maxValue = -1;
        encounteredNegativeValue = false;
        //This while loop works until the program read a negative value from the input file.
        while ( !encounteredNegativeValue) { 
            currentNumber = dataInputFile.nextInt();
            //If the value read is negative, the boolean is true which stops the loop.
            if ( currentNumber < 0) {
                encounteredNegativeValue = true;
            }
            //Until the value is negative, the loop finds the sum, the min and the max
            else {
                sum = sum + currentNumber;
                numberOfValues = numberOfValues + 1;
                
                if ( currentNumber < minValue) {
                    minValue = currentNumber;
                }
                if (currentNumber > maxValue) {
                    maxValue = currentNumber;
                }
                        
            }
            
        }
                     
        
        average = (double)sum / (double)numberOfValues;
        System.out.println( "Sum is" + sum + " .");
        System.out.println( "Average is " + average + " .");
        System.out.println( "Min value is " + minValue + " .");
        System.out.println( "Max value is " + maxValue + " .");
               
                       
        dataInputFile.close();
        scan.close();
    }
    
}
