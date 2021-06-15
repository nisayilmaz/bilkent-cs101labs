import java.util.Scanner;

/**
 * Create a rectangle based on input from user. If possible create a hollow rectangle, if not print "no hole" 
 * @author Nisa Yılmaz
 * @version 22.11.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Variables
        
        int height;
        int width;
        int i;
        int k;
        int thickness;
        char answer;
        // Program Code
        //do-while loop is for user input based repetition, if the user want to try again thehave to enter the character "y"(not case sensetive)
        do {
            //Ask and get height, width and wall thickness from the user.
            System.out.println( "Hello, to create a rectangle please enter width: ");
            width = scan.nextInt();
            System.out.println( "Now please enter its height: ");
            height = scan.nextInt();
            System.out.println( "Lastly, please enter wall thickness for a hollow rectangle: ");
            thickness = scan.nextInt();
            //Check if all the values are positiv, if they are not print an error message.
            if ( height <= 0 || width <= 0 ) {
                System.out.println( "Sorry, all values must be positive");
            }
            //If not print the rectangle.
            else{
                //This for loop is responsible from the height.
                for (i = 0; i < height ; i++) {
                    //This for loop is responsible from width.
                    for (k = 0 ; k < width; k++) {
                        //Check if the wall thickness is established, if not print accordingly.
                        if (k < thickness || thickness >= width - k || i < thickness || thickness >= height - i ){  
                            System.out.print( "+");                
                        }
                        //If the thickness is enough just print blank in order to create a holllow rectangle.
                        else{
                            System.out.print(" ");
                        }
                                                            
                    }
                    System.out.println("\n");
                    
                }
                //If the rectangle doesn't have any holes, print "Oops, no hole.".
                if (thickness * 2 >= width || thickness * 2 >= height) {
                    System.out.println( "Oops, no hole.");
                }
                
            }
            //Ask and get from the user if they want to start again. If thy enter "Y" of "y" the program strats from the beginning.
            System.out.println( "If you want to start again, please enter 'Y'. If not, enter a random character.");
            answer = scan.next().charAt(0);
                 
                       
            
        }
        while ( answer == 'y' );
        //If the user enters "n" or "N" prints goodbye message.
        if ( !(answer == 'y' || answer == 'Y') ) {
            System.out.println( "Goodbye");
        }
        
        
               
        
        scan.close();
    }
    
}