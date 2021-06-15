import java.util.Scanner;

/**
 * Program Description 
 * @author Program Author
 * @version 22.12.2020
*/ 
public class TestLibrary
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        Library library = new Library();
        String operation;
        String bookName;
        String authorName;
        
        // Program Code

        
        do {
            System.out.println( "Please choose (please enter the first letter): Show, Find, Add, and Exit");
            System.out.println("---------------------------------------------------------------------------");
            operation = scan.nextLine();
            
            if (operation.equalsIgnoreCase("s")) {
                System.out.println( library.toString());
            }
            if(operation.equalsIgnoreCase("f")){
                System.out.print( "Enter the name of the book that you want to find: ");
                bookName = scan.nextLine();
                System.out.println(library.findByTitle(bookName));
            }
            if(operation.equalsIgnoreCase("a")){
                
                System.out.print( "Enter book title: ");
                
                bookName = scan.nextLine();
                System.out.print( "Enter author name: ");
                authorName = scan.nextLine();
                library.add( bookName, authorName);
            }
            if (operation.equalsIgnoreCase("e")) {
                System.out.println( "Goodbye!");
            }
        } while ( !(operation.equalsIgnoreCase("e")));
    
    
        scan.close();
    }
    
}