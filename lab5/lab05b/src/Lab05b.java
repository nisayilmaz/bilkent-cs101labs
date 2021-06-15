import java.util.Scanner;

/**
 * Creates 4 different tables depending on user input. 
 * @author Nisa Yılmaz
 * @version 23.11.2020
*/ 
public class Lab05b
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final int MAXIMUM_CHARACTER_NUMBER = 6;
        
        // Variables
        int row;
        int column;
        int targetRow;
        int targetColumn;
        String rowString; 
        String columnString;
        String columnAndRow;
        int numberOfSpace;
        int numberOfCharacters;
        String product;
        int number;
        String numberString;
       
        
        
    
        
        // Program Code
        //Ask and get the number of columns and rows from the user.
        System.out.println( "Welcome, please enter target number of rows: "); 
        targetRow = scan.nextInt();  
        System.out.println( "Welcome, please enter target number of columns: "); 
        targetColumn = scan.nextInt();
        
        System.out.println();
        System.out.println( "The first table");
        for ( row = 1; row <= targetRow; row++) {
            
            for ( column = 1; column <= targetColumn; column++) {  
                
                //Turn the integer vslues of row and column to string.
                rowString = Integer.toString( row);
                columnString = Integer.toString( column);
                //Combine the two strings.
                columnAndRow = rowString + "," + columnString;
                //Find the string length.
                numberOfCharacters = columnAndRow.length();
                 
                //The total of characters of the column and the row and the spaces must be 6. Print out spaces accordingly.
                for ( numberOfSpace = 0; numberOfSpace < MAXIMUM_CHARACTER_NUMBER - numberOfCharacters; numberOfSpace++) {
                    System.out.print(" ");
                    
                }
                System.out.print( columnAndRow);
                
                             
                
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println( "Multiplication table");
        for ( row = 1; row <= targetRow; row++) {
            
            for ( column = 1; column <= targetColumn; column++) {  
                
                //Find the product of the column and the row and turn it to a string.
                product = Integer.toString( row * column);
                //Find the string length.
                numberOfCharacters = product.length();
                
                //The total of characters of product and the spaces must be 6. Print out spaces accordingly.                     
                for ( numberOfSpace = 0; numberOfSpace < MAXIMUM_CHARACTER_NUMBER - numberOfCharacters; numberOfSpace++) {
                    System.out.print(" ");
                    
                }
                System.out.print( product);
                
                             
                
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println( "Counting table");
        number = 0;
        for ( row = 1; row <= targetRow; row++) {
            
            for ( column = 1; column <= targetColumn; column++) {  
                
                //Count from zero and turn it to a string.
                numberString = Integer.toString( number);
                //Find the string length.
                numberOfCharacters = numberString.length();
                
                //The total of characters of the number and the spaces must be 6. Print out spaces accordingly.
                for ( numberOfSpace = 0; numberOfSpace < MAXIMUM_CHARACTER_NUMBER - numberOfCharacters; numberOfSpace++) {
                    System.out.print(" ");
                    
                }
                System.out.print( number );
                number = number + 1;
                
                             
                
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println( "Weird table");
        for ( row = 1; row <= targetRow; row++) {
            
            for ( column = 1; column <= targetColumn; column++) {  
                
                //Turn the row number to a string.
                rowString= Integer.toString( row);
                //Find the string length.
                numberOfCharacters = rowString.length();
                                     
               
                    
                //Print the row number for the first column only.
                if (column == 1) {
                    //The total of characters of row number and the spaces must be 6. Print out spaces accordingly.
                    for ( numberOfSpace = 0; numberOfSpace < MAXIMUM_CHARACTER_NUMBER - numberOfCharacters ; numberOfSpace++) {
                        System.out.print(" ");
                    }
                    System.out.print(row);
                }
                //Print 5 spaces and one "-" in other columns.
                else {
                    for ( int i = 0; i < 5 ; i++) {
                        System.out.print(" ");
                    }
                     System.out.print("-");
                    
                }
                
                
                             
                
            }
            System.out.println();
        }
        
        
        scan.close();
    }
    
}