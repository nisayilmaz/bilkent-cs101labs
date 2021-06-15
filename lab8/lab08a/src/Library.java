import java.util.ArrayList;
public class Library {
    ArrayList<LibraryBook> library;
    
    public Library(){    
        this.library = new ArrayList<LibraryBook>(); 
    }
    public boolean isEmpty(){
        if ( library.size() == 0 ) {
            System.out.println( "Library is empty");
            return true;
        }
        else {
            System.out.println( "Library is not empty");
            return false;
        }
    }
    public void add( String title, String author){
        LibraryBook newBook = new LibraryBook(title, author);
        library.add(newBook);
    }
    
    public void remove(String bookName){
        int size = library.size();
        for ( int n= 0; n < size; n++) {
            if ( ((library.get(n)).title.equals(bookName))) {
                library.remove(n);
            }
        }
    }
    public LibraryBook findByTitle(String bookName){
        int size = library.size();
        LibraryBook book = null;
        for ( int n= 0; n < size; n++) {
            if ( ((library.get(n)).title.equals(bookName))) {
                book = library.get(n);
            }
        }
        return book;
        
    }
    public String toString(){
        String bookString = "";
        LibraryBook book;
        int size = library.size();
        if (library.isEmpty() == true) {
            return "This library is empty";
        }
        else {
            for (int i = 0; i < size; i++) {
                book = library.get(i);
                bookString = bookString + book.getName() + "\n";
               
            }
            return bookString;
        }
    }

    
}
