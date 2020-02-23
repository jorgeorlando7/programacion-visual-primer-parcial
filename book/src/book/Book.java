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
public abstract class Book {
    String mBookTitle; //title of the book
    double mPrice;      //price of the book
    
    public Book(String title ){
        mBookTitle=title;
    }
    
    public String gettitle(){
        return mBookTitle;
    }
    
    public double getPrice(){
        return mPrice;
    }
    
    public abstract void setPrice();
}