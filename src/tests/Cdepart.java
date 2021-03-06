package tests;

import org.testng.annotations.Test;
import base.config;
import locators.locators;
import values.values;

public class Cdepart extends config {

	locators loc = new locators();
	values val = new values();
	int myTourValue = 1234;

	@Test 
	public void tc04a () throws InterruptedException{
		//User should be able to enter integer values in the "Depart" & "Guests" text-boxes
//
//		typebyxpath (loc.departdate, val.tc03txtbxinteger); 
//		Thread.sleep(500);
//		String x = intverify(loc.departdate);
//		if (x!= val.tc03txtbxinteger){
//		System.out.println("FAILED: depart textbox is not active for integers");
//		}

		//		// visa
		//		typebyxpath (loc.passenger, val.tc03txtbxinteger);
		//		if (txtverify(loc.passenger, val.tc03txtbxinteger)) {System.out.println("PASS: guests textbox is active for integers");}
		//		else                                                {System.out.println("FAIL: guests textbox rejects integers");}

	}

	@Test(enabled=false)
	public void tc04b(){
		// 	 User should NOT be able to enter letters in the "Depart", "Guests" text-fields
		typebyxpath (loc.departdate, val.tc03txtbxletters);
		if (txtverify(loc.departdate, val.tc03txtbxletters)){System.out.println("PASS: depart textbox is NOT active for letters");}
		else                                                {System.out.println("FAIL: depart textbox is active for letters");}

		typebyxpath (loc.passenger, val.tc03txtbxletters);
		if(txtverify(loc.passenger, val.tc03txtbxletters)) {System.out.println("PASS: Guests textbox rejects letters");}
		else                                               {System.out.println("FAIL: Guests textbox allows letters");}

	}
}