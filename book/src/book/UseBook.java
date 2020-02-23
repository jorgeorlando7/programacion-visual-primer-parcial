/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author JOHDLS
 */
public class UseBook {
    
   
    public static void main(String[] args){
        Book books;
        books=new Fiction("harry potter");
        System.out.println(books.gettitle());
        books=new NonFiction("Once upon a time...");
        System.out.println(books);
        
        
    }
}