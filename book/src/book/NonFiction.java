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
public class NonFiction extends Book{

    public NonFiction(String title) {
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        super.mPrice=37.99;
    }
}