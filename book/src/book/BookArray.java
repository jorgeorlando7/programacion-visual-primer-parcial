
package book;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BookArray {
    static List<Book> booksList = new ArrayList<Book>();
    public static void main(String[] args){
        Book books;
        books=new Fiction("Harry Potter");
        booksList.add(books);
        books=new NonFiction("Once upon a time");
        booksList.add(books);
        books=new Fiction("FuictionBook2");
        booksList.add(books);
        books=new Fiction("FuictionBook3");
        booksList.add(books);
        books=new Fiction("FuictionBook4");
        
        
    }
    
}