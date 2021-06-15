public class LibraryBook {
    //properties
    String title;
    String author;
    String dueDate = "";
    int timesLoaned;
    //constructors
    public LibraryBook( String bookTitle, String bookAuthor){
        title = bookTitle;
        author = bookAuthor;
        
    }
    public LibraryBook ( LibraryBook book){
        this.title = book.title;
        this.author = book.author;
    }
    
    //methods
    public String toString(){
        return title + ", " + author + ", " + dueDate + ", " + timesLoaned;
    }
  
    public void loanBook( String due ){
        if ( !onLoan()) {
            timesLoaned = timesLoaned + 1;
            dueDate = due;
            System.out.println( "///Book loaned");
        }
        else{
            System.out.println( "///Book is already on loan");
        }
        
    }
    public void returnBook(){
        dueDate = "";
    }
    
    public void updateDueDate(String due){
        dueDate = due;
        System.out.println( "///Due date updated");
    } 
    public String getName(){
        return title + ", " + author;
    }
    public int getTimesLoaned(){
        return timesLoaned;
    }
    public boolean onLoan(){
        if ( !dueDate.equals("")) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean equals(LibraryBook input){
        String name = input.getName();
        if (name.equals( title + ", " + author )) {
            return true;
        }
        return false;
    }
    public boolean hasSameTitle( LibraryBook book){
        if (( this.title).equals(book.title)) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hasSameAuthor( LibraryBook book){
        if (( this.author).equals(book.author)) {
            return true;
        }
        else{
            return false;
        }
    }
    

    
}