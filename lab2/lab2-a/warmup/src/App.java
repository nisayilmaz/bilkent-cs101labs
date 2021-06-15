import java.util.Scanner;

/**
 * There are the warmup exercises from David's Bits 'n Pieces 
 * @author Nisa Yılmaz
 * @version 27.10.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final String MYNAME = "Nisa";
        
        // Variables
        String myName;
        String username;
        int age;
        
        // 1.
        System.out.println("Hello Nisa, welcome to Java!");
        System.out.println();
        //2.
        System.out.println("Hello ");
        System.out.println("Nisa, ");
        System.out.println("welcome to java!");
        //3.
       System.out.println("Hello " + MYNAME + ", welcome to java!");
        //4.
        myName = "Nisa";
        System.out.println("Hello " + myName + ", welcome to java!");
        //5.
        System.out.println("Please enter your name here:");
        username = scan.next();
        System.out.println("Hello " + username + ", welcome to java!");
        //6.
        System.out.println("Please enter your age here:");
        age = scan.nextInt();
        System.out.println("Your age is " + age);
        
        
        
    }
    
}