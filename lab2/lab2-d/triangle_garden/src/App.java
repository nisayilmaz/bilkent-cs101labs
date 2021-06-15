import java.util.Scanner;

/**
 * This program calculates the max number of flowers in your triangle garden. 
 * @author Nisa Yılmaz
 * @version 26.10.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        
        // Variables
        int firstSide;
        int secondSide;
        int thirdSide;
        double semiPerimeter;
        double area;
        double numberOfFlowers;
        int intPartOfFlowers;
       
    
        
        // First ask the user for triangle side's length. Then input those values.
        System.out.println("Welcome to triangle garden.This program helps you calculate the max number of flowers you can plant in your triangle garden given that there can be 17 flowers for each square meter of soil. Please note that this program doesn't check whether a triangle exists or not since we haven't learned if statements.");
        System.out.println("To start please enter a number for the triangle's first side (Make sure you enter integer values, else the program wont work!):");
        firstSide = scan.nextInt();
        System.out.println("Now enter a second number, this will be the lenght of the second side:");
        secondSide = scan.nextInt();
        System.out.println("And enter a number for the third side:");
        thirdSide = scan.nextInt();
        // Print the values for the user to see.
        System.out.println("Now you have a triangle with side lengths " + firstSide + " , " + secondSide + " and " + thirdSide + " meters."); 
        
         //Calculate the semi perimeter. To do that use the formula semi perimeter = (a+b+c)/2 where a,b and c are the lenghts of the triangle's sides.
         semiPerimeter = (firstSide + secondSide + thirdSide )/2.0;
         //Now use the semi perimeter and Heron's formula to calculate the area of the triangle. Print out the value.
         area = Math.sqrt (semiPerimeter*(semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
         System.out.println("Your garden has an area of " + area + " square meters .");
         //To calculate the amount of flowers multiply the area by 17 and print the integer part of the value you have found.
         numberOfFlowers = area * 17;
         intPartOfFlowers = (int) numberOfFlowers;
         System.out.println("You can have " + intPartOfFlowers +" flowers in your garden! Thanks for using triangle garden and have fun planting your flowers :)");
        
      
        
    }    
        
}        