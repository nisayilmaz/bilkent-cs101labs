import java.util.Scanner;

/**
 * This program creates half pyramid with the character and width chosen by the user 
 * @author Nisa Yılmaz
 * @version 04.11.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Variables
        char character ;
        int targetNumberOfLines ;
        int row ;
        int column ;
        
        //Program code
        //Ask and get character from the user.
        System.out.println("Please enter a character:");
        character = scan.next().charAt(0);
        System.out.println("Please enter width:");
        targetNumberOfLines = scan.nextInt();
        System.out.println();
        
    
        row = 0;
         while(row < targetNumberOfLines ){
            column = 0;
            while(column <= row){
                System.out.print(character);
                column = column + 1;
                
            }
            System.out.println();
            row = row + 1;
        }
        
        System.out.println();
        
        while (targetNumberOfLines > 0){
            column = targetNumberOfLines;
            while (column > 0) {
                System.out.print(character);
                column = column - 1;
            }
            targetNumberOfLines = targetNumberOfLines -1;
            System.out.println();
            
        }
                
         
        
        scan.close();
    }
    
}