import java.util.Scanner;
import java.io.*;

/**
 * This program prints out and stores as many random numbers as the user wants in a file( file name is also chosen by the user.)
 * @author Nisa Yılmaz
 * @version 17.11.2020
*/ 
public class App
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
        PrintStream originalStdOut = System.out;
        
        // Variables
        int countOfNumbers;
        int randomNumber;
        String fileName;
        
        
        // Program Code
        //Ask and get the number of random numbers from the user.
        System.out.println("Welcome. This program generates random number in (-50, 50) for you. Please enter how many numbers you want:");
        countOfNumbers = scan.nextInt();
        //Ask and get the file name from the user.
        System.out.println("Now please enter the name of file you want to store these numbers in: ");
        fileName = scan.next();
        System.setOut( new PrintStream( fileName + ".txt") );
        //Create random numbers and print them out.
        while ( countOfNumbers > 0) {
            //Change the range to [-49, 49]
            randomNumber =  (int)(( Math.random() - 0.5) * 100);
            System.out.println( randomNumber);  
            countOfNumbers = countOfNumbers - 1;          
            
        }
        System.out.close();
        System.setOut( originalStdOut);
        System.out.println( "File created.");
        
        scan.close();
    }
    
}