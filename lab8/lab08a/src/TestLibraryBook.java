public class TestLibraryBook {
    public static void main(String[] args){
        LibraryBook firstBook = new LibraryBook("The Book Thief" , "Markus Zusak"  );
        LibraryBook secondBook = new LibraryBook("To Kill a Mockingbird" , "Harper Lee");
        LibraryBook thirdBook = new LibraryBook("The Book Thief" , "Markus Zusak"  );
        LibraryBook fifthBook = new LibraryBook("To Kill a Mockingbird", "Markus Zusak"  );
        LibraryBook l = firstBook;
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
        System.out.println( firstBook == secondBook);
        
        System.out.println(firstBook.equals(thirdBook));
        LibraryBook fourthBook = new LibraryBook(secondBook);
        System.out.println(fourthBook);
        System.out.println( fifthBook.hasSameTitle( secondBook));
        System.out.println(fifthBook.hasSameAuthor( secondBook));
        Library library = new Library();
        library.isEmpty();
        library.add( "Moby Dick","Herman Melville");
        library.isEmpty();

        System.out.println(library.findByTitle("dsdfs"));
        System.out.println(library.findByTitle("Moby Dick"));
        System.out.println(firstBook == thirdBook);
        System.out.println( thirdBook.hasSameAuthor(fifthBook));
        System.out.println( secondBook.hasSameTitle(fifthBook));
        library.add("sdfs", "sdfvksdf");
        library.add("gjhhj", "sesff");
        System.out.println(library.toString());
        
    }
    
    
    
}
