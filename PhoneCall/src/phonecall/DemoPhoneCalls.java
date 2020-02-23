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
public class DemoPhoneCalls {

	public static void main(String[] args){
		PhoneCall a = new OutgoingPhoneCall("1",1);
		a.display();
		PhoneCall b = new IncomingPhoneCall("2");
		b.display();
		
		PhoneCallArray c = new PhoneCallArray();
		c.display();
	}
}