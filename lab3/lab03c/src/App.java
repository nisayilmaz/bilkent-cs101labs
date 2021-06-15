import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
/**
 * @author Nisa Yılmaz
 * @version 02.11.2020
*/ 
public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Variables
        String name;
        int age;
        double grossSalary;
        String comments;
        String taxRate;
        double netSalary;
        
        //Constants
        final String DOCTYPE = "<!DOCTYPE html>";
        final String HTML_OPEN = "<html>";
        final String HEAD_OPEN = "<head>";
        final String TITLE_OPEN = "<title>";
        final String TITLE_CLOSE = "<title/>";
        final String HEAD_CLOSE = "</head>";
        final String BODY_OPEN = "<body>";
        final String BODY_CLOSE = "</body>";
        final String HTML_CLOSE = "</html>";
        final String HR = "<hr>";
        final String PARAGRAPH_OPEN = "<p>";
        final String PARAGRAPH_CLOSE = "</p>";
        final String HEADING_OPEN = "<h1>";
        final String HEADING_CLOSE = "</h1>";

       
        // Program Code
        //Ask and get name, age, gross salary and comments from the user.
        System.out.println("<!--");
        System.out.println("Please enter name here:");
        name = scan.next();
        System.out.println("Please enter age here:");
        age = scan.nextInt();
        System.out.println("Please enter salary here:");
        grossSalary = scan.nextDouble();
        System.out.println("Please enter comments here:");
        scan.nextLine();
        comments = scan.nextLine();
        System.out.println("-->");
        
        if ( age < 0 && grossSalary > 10_000 ){
            System.out.println("Error. Please enter a positive age value and salary less than 10.000.");
        }
        else if ( age < 0 && grossSalary < 10_000){
            System.out.println("Error. Enter a positive age value.");
        }
        else if (age > 0 && grossSalary > 10_000){
            System.out.println("Error. Salary value must be smaller than 10.000");
        }
        else {
            //Calculate the net salary depending on gross salary. If gross salary is less than 1000 tax rate is 5%.
            if ( grossSalary < 1000 ){
                taxRate = "5%";
                netSalary = (grossSalary - 100.0) * (95.0/100.0);
            }
            // If gross salary is between 1000 and 5000 tax rate is 15%.
            else if ( grossSalary >= 1000 && grossSalary <= 5000){
                taxRate = "15%";
                netSalary = (grossSalary - 100.0) * (85.0/100.0);
            }
            // If gross salary is more than 5000 tax rate is 25%.
            else{
                taxRate = "25%";
                netSalary = (grossSalary - 100.0 ) * (75.0/100.0);
            }
            // Print the html template.
            System.out.println(DOCTYPE);
            System.out.println();
            System.out.println(HTML_OPEN);
            System.out.println();
            System.out.println(HEAD_OPEN);
            System.out.println(TITLE_OPEN +name + "'s Home Page" + TITLE_CLOSE);
            System.out.println(HEAD_CLOSE);
            System.out.println();
            System.out.println(BODY_OPEN);
            System.out.println();
            System.out.println(HR);
            //Check if the photo exists, if it does put it in the html code.
            if ( Files.exists( Paths.get( name + ".jpg"))){
                System.out.println("<img src='" + name + ".jpg'>");
            }
            System.out.println(HEADING_OPEN + name + HEADING_CLOSE);
            System.out.println(PARAGRAPH_OPEN + "Age: " + age + PARAGRAPH_CLOSE );
            System.out.println(PARAGRAPH_OPEN + "Salary: " + (int)netSalary + " Taxrate: " + taxRate + PARAGRAPH_CLOSE );
            System.out.println( PARAGRAPH_OPEN + "Comments: " + comments + PARAGRAPH_CLOSE );
            System.out.println(HR);
            System.out.println();
            System.out.println(BODY_CLOSE);
            System.out.println();
            System.out.println(HTML_CLOSE);
            
            
                
        }
        scan.close();
     }
    
}