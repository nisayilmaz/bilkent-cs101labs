import java.util.Scanner;

/**
 * Program Description 
 * @author Program Author
 * @version 28.11.2020
*/ 
public class Lab06a
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final int NUMBER_OF_VALUES = 10;
        
        // Variables
        String inputString;
        String powerValue;
        String newString;
        String result;
        String nString;
        String firstTermString;
        String secondTermString;
        String thirdTermString;
        String finalTermString;
        String sinx;
        String mathSinx;
        String difference;
        long factorialValue;
        int firstValue;
        int secondValue;
        int sum;
        int k;
        int t;
        int counter;
        int length;
        double firstTerm;
        double secondTerm;
        double thirdTerm;
        double finalTerm;
        double x;
        double currentValue;
        
        // Program Code
        //Ask and get two decmal values from the user.
        System.out.print( "Enter two decimal values to add them together and convert the sum to binary : ");
        firstValue = scan.nextInt();
        secondValue = scan.nextInt();
        //Add the two decimal values.
        sum = firstValue + secondValue;
        //Ask and get a sentence from the user.
        System.out.print( "Enter a sentence to reverse it: ");
        scan.nextLine(); //Dummy line
        inputString = scan.nextLine();
        //Ask and get x value for sin(x) from the user.
        System.out.print( "Please enter x for sin(x): ");
        x = scan.nextDouble();
        result = "";
        //Find the length of the sentence given by the user.
        length = inputString.length();
        t = 0; 
        //Repeat this loop until the end of sentence character by character  
        for ( k = 0; k < length; k++) {
            //If the current character is a space create a substring.
            if ( inputString.charAt(k) == ' ') {
                newString = inputString.substring( t, k); 
                //Reverse the substring and add it to the reversed sentence. 
                result = result + reverseString( newString) + " ";
                t = t + newString.length() + 1;
            }
            //There wont be space at the end of the sentence so we should consider it seperately. If we are at the end of the sentence execute this code.
            if ( k == length - 1) {
                t = result.length();
                newString = inputString.substring( t, k + 1);
                result = result + reverseString( newString);
            }           
        }
        //Print the results.
        System.out.println( "------------------------------------------------------------\n\n");
        System.out.println( "Your sentence reversed is \" " + result + " \" .");
        System.out.println( firstValue + " plus " + secondValue + " is " + toBinary( sum) + " in binary");
        System.out.println( "------------------------------------------------------------\n\n");
        
        //Find the powers of values n from 1 to 4.
        for ( int n = -1; n <= 10; n++) {
            for (int i = 1; i <= 4; i++) {
                //Convert the values to a string.
                powerValue = String.valueOf( (int)power(n, i));
                //Usingprintf print the values.
                System.out.printf( "%8s" , powerValue);
                
            }
            System.out.println();
        }
        
        System.out.println( "------------------------------------------------------------\n\n");
        //Find the factorial of values from 1 to 15.
        for ( int n = 1; n <= 15; n++) {
            factorialValue = (int)factorial(n);
            //Print out the values.
            System.out.printf( "%15d" , factorialValue );
            if (n % 5 == 0) {
                System.out.println();
            } 
        }
        //print out the terms of the table.
        System.out.println( "------------------------------------------------------------\n\n");
        System.out.printf( "%30s %30s %30s %30s %30s ", "n" , "(-1)^n" , "x^(2n+1)" , "(2n+1)!",  "sin(x)");
        System.out.println("\n");
        finalTerm = 0;
        counter = 1;
        //Calculate the terms of the taylo series .
        for (int n = 0; n <= NUMBER_OF_VALUES; n++) {   
            firstTerm = power( (-1), n);
            secondTerm = power( x, ((2 * n) + 1));
            thirdTerm = factorial((2 * n) + 1);
            //Convert the values to string to use printf.
            nString = String.valueOf( n);
            firstTermString = String.valueOf( firstTerm);
            secondTermString = String.valueOf( secondTerm);
            thirdTermString =String.valueOf( thirdTerm);
            currentValue = power(x , counter) / factorial(counter);
            //Find the sinx using taylor series for the first 10 terms. 
            if ( n % 2 == 0) {
                finalTerm = finalTerm + currentValue;
            }
            else {
                finalTerm = finalTerm - currentValue;
            }
            counter = counter + 2;
            finalTermString = String.valueOf( finalTerm);
            //Print out the results.    
            System.out.printf("%30s %30s %30s %30s %30s%n", nString, firstTermString, secondTermString, thirdTermString, finalTermString);
          
        }
        System.out.println();
        x  = 3.14;
        //Print out the trems of the table.
        System.out.printf("%30s %30s %30s%n", "sin(x)", "Math.sin(x)", "difference");
        //Compare sin(x) method and Math.sin(x) method and fins the diffrenece between them
       
            sinx = String.valueOf(sin(x));
           
            mathSinx = String.valueOf(Math.sin(x));
            
            difference = String.valueOf(Math.abs(Math.sin(x) - sin(x)));
            
            System.out.printf("%30s %30s %30s%n", sinx , mathSinx, difference);
        
  
        scan.close();
    }
    
    /**
     * This method finds the x to the power of y where x is any real number and y is bigger or equal to 0.
     * @param number the first entered  value and it is the base.
     * @param power the second entered value and it is the exponent.
     * @return "number" to the power of "power".
     */
    
    public static double power( double number, int power) {
        double result = 1;
        //Any number to thepower of 0 is 1. Return 1 if the exponent is 0.
        if ( power == 0) {
            return 1;
        }
        else {
            //Multiply the number by itself as many times as the exponent.
            int currentPower = 0;
            while( currentPower < power) {
                result = result * number;
                currentPower = currentPower + 1;
            }
            return result;
        }
        
    /**
     * This method finds the factorial of a given number.
     * @param factorial is the given number.
     * @return factorial of the number.
     */  
    }
    
    public static double factorial( int factorial) {
        double currentValue;
        //Multiply the current value with the next whole number until you reach the input value.
        for( currentValue = 1; factorial > 0; factorial--) {
            currentValue = currentValue * factorial;
        }
        return currentValue;
    }
    
    /**
     * this method reverses the given string.
     * @param input is the string to be reversed.
     * @return the reverse of the input.
     */
    
    public static String reverseString( String input) {
        String reverse = "";
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
            
        }
        return reverse;
        
    }
    
    /**
     * this method converts binary to decimal.
     * @param binaryInput is the binary number that will be converted to decimal number.
     * @return the decimal value of binaryInput.
     */
    
    public static int toDecimal( String binaryInput) {
        int length = binaryInput.length();
        int result = 0;
        int counter = 1;
        for (int i = 0; i < length; i++) {
            int binaryInt = Integer.valueOf( String.valueOf(reverseString(binaryInput).charAt(i)));
            result = result + (binaryInt * counter);
            counter = counter * 2;
        }
        return result;
    }
    
    /**
     * this method converts decimal number to binary.
     * @param decimalInput is the number that will be converted to binary.
     * @return the binary value of decimalInput.
     */
    
    public static String toBinary( int decimalInput) {
        String result;
        String binary = "";
        while ( decimalInput  > 0) {
            
            int remainder = decimalInput % 2;
            binary = binary + remainder;
            decimalInput = decimalInput / 2;
                                   
        }
        result = reverseString( binary);
        return result;
    }
    /**
     * This method computes sinx with taylor series
     *@param x is the radian value
     *@return sin of x
     */
      
    public static double sin( double x) {
        double finalTerm = 0;
        double currentValue = x;
        int n = 1;
        
    
        for (int i = 1; i <= 80; i++) {
            
            finalTerm = finalTerm + currentValue;
            currentValue = -currentValue * (power(x ,2) * factorial(n)/ factorial(n + 2));
            n = n + 2;           
          
        }
        return finalTerm;
    }
   
}