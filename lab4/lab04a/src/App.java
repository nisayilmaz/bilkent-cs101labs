import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //variables
        int number;
        int value;
        int numberOfLopps;
        
        //Program code
        value = 0;
        System.out.println("Enter a number:");
        number = scan.nextInt();
        if ( number < 0 ){
            System.out.println("Error.");
        }
        else{
            //1.
            System.out.println("\n......................");//This line exists due to aesthetic purposes only.
            while(value < number){
                System.out.print(value + " " );
                value = value + 1;
            }
            System.out.println("\n......................");
        
            //2.
            value = 0; // Value is already n from the prior loop so the second doesn't work if we don't set it to 0
            while(value < number){
                System.out.print(value + " " );
                value = value + 1;
                if(value % 5 == 0){
                    System.out.println();
                }
                
            }
            System.out.println("\n......................");
            //3.
            value = number;
            while( value >= 0){
                System.out.print(value + " ");
                value = value - 1;
            }
            System.out.println("\n......................");
            //4.
            value = -number;
            while (value <= number){
                if ( value % 2 == 0 ){
                    System.out.print( value * value + " ");
                    value = value +2;
                }
                else {
                    value = value + 1;
                    
                }    
            }
            System.out.println("\n......................");
            //5.
            value = 0;
            while ( value <= number){
                if( value % 2 == 0){
                    System.out.print( value * value + " ");
                    value = value + 2;
                }
                else { 
                    value = value + 1;
                }
                if(value % 5 == 0){
                    System.out.println();
                }
            }
            System.out.println("\n......................");
            //6.
            value = number;
            while ( value >= 3){
                if( value % 3 == 0 || value % 4 == 0 ){
                    if( value % 12 == 0){  
                        value = value -1;
                    }
                    else{
                        System.out.print(value + " ");
                        value = value - 1;
                    }
                }
                else{
                    value = value - 1;
                }
            }   
            System.out.println("\n......................");
            //7.
            value = 1 ;
            numberOfLopps = 0;
            while ( value <= number){
                if ( number % value == 0) {
                    System.out.print(value + " " );
                    numberOfLopps = numberOfLopps + 1;
                    if ( (numberOfLopps) % 5 == 0){
                        System.out.print("\n");
                    }
                                               
                    value = value + 1;
                }
                else {
                    value = value + 1;
                }
                                  
            
   
        }
        scan.close();
    }
}
}