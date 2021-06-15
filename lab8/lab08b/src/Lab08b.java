import java.util.Scanner;
import java.io.File;

import java.util.ArrayList;
import java.util.Collections;
 

/**
 * Program Description 
 * @author Program Author
 * @version 22.12.2020
*/ 
public class Lab08b
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner( new File( "src/testdata.txt") );
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> frequency = new ArrayList<Integer>();
        
        
        // Variables
        String currentWord;
        int length;
        int number;
        int index;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;
        int counter10 = 0;
        
        // Program Code
        while (dataInputFile.hasNext()) {
            currentWord = dataInputFile.next();
            length = currentWord.length();
            list.add(length);
            
            if (length == 1) {
                counter1 += 1;
                
            }
            if (length == 2) {
                counter2 += 1;
                
            }
            if (length == 3) {
                counter3 += 1;
                
            }
            if (length == 4) {
                counter4 += 1;
                
            }
            if (length == 5) {
                counter5 += 1;
                
            }
            if (length == 6) {
                counter6 += 1;
                
            }
            if (length == 7) {
                counter7 += 1;
                
            }
            if (length == 8) {
                counter8 += 1;
                
            }
            if (length == 9) {
                counter9 += 1;
                
            }
            if (length == 10) {
                counter10 += 1;
                
            }
        }
        Collections.addAll(frequency,counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9, counter10);
        number = Collections.max(frequency);
        index = frequency.indexOf(Collections.max(frequency));
        
        
        System.out.println( "There are " + counter1 + " words which have 1 word");
        System.out.println( "There are " + counter2 + " words which have 2 words");
        System.out.println( "There are " + counter3 + " words which have 3 words");
        System.out.println( "There are " + counter4 + " words which have 4 words");
        System.out.println( "There are " + counter5 + " words which have 5 words");
        System.out.println( "There are " + counter6 + " words which have 6 words");
        System.out.println( "There are " + counter7 + " words which have 7 words");
        System.out.println( "There are " + counter8 + " words which have 8 words");
        System.out.println( "There are " + counter9 + " words which have 9 words");
        System.out.println( "There are " + counter10 + " words which have 10 words");
        System.out.println(Collections.max(list) + " is the maximum number of letters");
        System.out.println( "most frequently repeated word was repeated " + number + " times and it has " + (index + 1) + " letters." );
        scan.close();
    }
    
}
