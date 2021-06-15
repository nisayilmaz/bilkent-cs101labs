import java.util.Scanner;

/**
 * @author Nisa Yılmaz
 * @version 27.10.2020
*/ 
public class website
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Variables
        String name;
        int age;
        double salary;
        String comments;
        // Program Code
        System.out.println("<!--");
        System.out.println("Please enter name here:");
        name = scan.next();
        System.out.println("Please enter age here:");
        age = scan.nextInt();
        System.out.println("Please enter salary here:");
        salary = scan.nextDouble();
        System.out.println("Please enter comments here:");
        scan.nextLine();
        comments = scan.nextLine();
        System.out.println("-->");
       
       
        System.out.println("<!DOCTYPE html>");
        System.out.println();
        System.out.println("<html>");
        System.out.println();
        System.out.println("<head>");
        System.out.println("<title>" +name + "'s Home Page</title>");
        System.out.println("</head>");
        System.out.println();
        System.out.println("<body>");
        System.out.println();
        System.out.println("<hr>");
        System.out.println("<h1>" + name + "</h1>");
        System.out.println("<p>Age: " + age + "</p>" );
        System.out.println("<p>Salary: " + salary + "</p>" );
        System.out.println("<p>Comments: " + comments + "</p>" );
        System.out.println("<hr>");
        System.out.println();
        System.out.println("</body>");
        System.out.println();
        System.out.println("</html>");
        
        
        
        
        scan.close();
     }
    
}