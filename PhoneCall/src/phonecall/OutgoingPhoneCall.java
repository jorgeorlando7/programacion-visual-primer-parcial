/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecall;

/**
 *
 * @author JOHDLS
 */
public class OutgoingPhoneCall extends PhoneCall{
	protected static final double PRICE_PER_MINUTE = 0.04;
	protected double minutes;
	
	public OutgoingPhoneCall(String passedPhoneNumber, double mins) {
		super(passedPhoneNumber);
		super.setPrice(PRICE_PER_MINUTE);
		setMinutes(mins);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public double getPrice() {
		setPrice(PRICE_PER_MINUTE * getMinutes());
		return price;
	}

	public double getMinutes() {
		return minutes;
	}
	public void setMinutes(double newMinutes){
		minutes=newMinutes;
	}

	public void display() {
		System.out.println("Incoming Phonecall: " + getPhoneNumber()
				+ "\nPrice: $" + PRICE_PER_MINUTE + " per minute."
				+ "\nMinutes: " + getMinutes() 
				+ "\nTotal Cost: $" + getPrice()
				+"\n");
	}
}