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
public class IncomingPhoneCall extends PhoneCall {
	protected static final double PRICE_INCOMING_CALL = 0.02;

	public IncomingPhoneCall(String passedPhoneNumber) {
		super(passedPhoneNumber);
		super.setPrice(PRICE_INCOMING_CALL);
	}

	public String getPhoneNumber() {
            String phoneNumber;
		return phoneNumber;
	}

	public double getPrice() {
		return PRICE_INCOMING_CALL;
	}
	
	public void display() {
		System.out.println("Incoming Phonecall: " + getPhoneNumber()
				+ "\nPrice: $" + PRICE_INCOMING_CALL + " per received call."
				+ "\nTotal Cost: $" + getPrice()
				+"\n");
	}

	
}