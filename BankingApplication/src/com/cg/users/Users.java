package com.cg.users;

import com.cg.application.*;
import com.cg.framework.*;

public class Users {

	public static void main(String[] args) {
		
		BankFactory s = new MMBankFactory();
		
		SavingAcc p = new MMSavingAcc(1000254501, "Nilesh Rathod", 85000.0f, true);

		CurrentAcc n = new MMCurrentAcc(1000254502, "Nikhil Wadhai", 23986.6f, 50);
		
		System.out.println("Saving Account");
		
		p.withdraw(p.getAccBal());
		
		System.out.println("Current Account");
	
		n.withdraw(n.getMINBAL());
		
		System.out.println(p);
		
		System.out.println(n);
	}

}
