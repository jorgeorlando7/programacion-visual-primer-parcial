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
public abstract class Auto
{
  protected String carType;
  protected double price;
  public Auto(String make)
  {
    carType = make;
  }
  public String getCarType()
  {
    return carType;
  }
  public void setCarType(String s)
  {
    carType = s;
  }
  public double getPrice()
  {
    return price;
  }
  public abstract void setPrice();
  public abstract void print();
}
