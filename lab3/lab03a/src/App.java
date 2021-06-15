import java.util.Scanner;

/** 
 * @author Nisa Yılmaz
 * @version 03.11.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Variables
        int n;
        int firstSum;
        int numberOfEven;
        int sencondSum;
        //Program code
        System.out.println("Enter a number in [0, 50]");
        n = scan.nextInt();
        firstSum = 0;
        numberOfEven = 0;
        
        for ( int x = 0; x <= 50; x++ ){
            //This if statement calculates the sum of numbers from 0 to n without the (n * (n + 1))/2 formula.
            if(x <= n){
                firstSum= firstSum + x;
            }
            //This is statement checks whether the number is between 12 and 25. If it is in the range prints out the number.
             if(12 <= x && x <= 25){
                System.out.println(x);
            }
            //If the number is not between 12-25 prints out "number is out of range".
            else{
                System.out.println(x  + " Number is out of range (12,25)");
               
            }
            // Checks if the number is divisible by 5, 2, 3 and 7 in this order.
            if ( x % 5 == 0){
                System.out.println("HiFive!");
            }
            else if (x % 2 == 0){
                System.out.println("HiTwo!");
                
            }
            else if (x % 3 == 0 || x % 7 == 0 ){
                System.out.println("Hi ThreeorSeven!");
                
            }
            else {
                System.out.println("HiOthers!");
            }
            //Checks if the number is even by determining whether it is divisible by 2 or not. If it is even, adds one to the number of even numbers.
            if (x % 2 == 0){
                numberOfEven = numberOfEven + 1;
            }
           
        }
        //Prints out the number of even numbers in[0,50].
        System.out.println("There are " + numberOfEven +" even numbers between[0,50]");
        //Checks whether the sum of numbers from 0 to n is correct with the formula. If correct, prints the result.
        sencondSum = (n * (n + 1)) / 2;
        if(firstSum == sencondSum ){
            System.out.println("Sum from 0 to " + n + " is " + firstSum);
        }
        //If uncorrect prints "error".
        else{
            System.out.println("Error");
        }
        scan.close();
    
    
    }  
    
    
}