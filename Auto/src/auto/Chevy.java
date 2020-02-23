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
public class Chevy extends Auto
{
  public Chevy()
  {
    super("Chevy");
    setPrice();
    print();
  }
  public void setPrice()
  {
    price = 22000;
  }
  public void print()
  {
    System.out.println("A new " + carType + " costs $" + price);
  }
}