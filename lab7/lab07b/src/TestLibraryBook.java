public class TestLibraryBook {
    public static void main(String[] args){
        LibraryBook firstBook = new LibraryBook("The Book Thief" , "Markus Zusak"  );
        LibraryBook secondBook = new LibraryBook("To Kill a Mockingbird" , "Harper Lee");
        System.out.println( "1) " + firstBook.toString());
        System.out.println( "2) " + secondBook.toString());
        firstBook.loanBook("wednesday");
        System.out.println( "1) " + firstBook.toString());
        System.out.println( "2) " + secondBook.toString());
        firstBook.returnBook();
        System.out.println( "1) " + firstBook.toString());
        System.out.println( "2) " + secondBook.toString());
        secondBook.loanBook("friday");
        secondBook.loanBook("saturday");
        System.out.println( "1) " + firstBook.toString());
        System.out.println( "2) " + secondBook.toString());
        secondBook.updateDueDate("monday");
        System.out.println( "1) " + firstBook.toString());
        System.out.println( "2) " + secondBook.toString());
        
    }
    
    
    
}
