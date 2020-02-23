/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author JOHDLS
 */
public class Ford extends Auto
{
  public Ford()
  {
    super("Ford");
    setPrice();
    print();
  }
  public void setPrice()
  {
    price = 20000;
  }
  public void print()
  {
    System.out.println("A new " + carType + " costs $" + price);
  }
}