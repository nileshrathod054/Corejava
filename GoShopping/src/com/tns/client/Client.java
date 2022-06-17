package com.tns.client;

import com.tns.application.*;

import com.tns.framework.*;

public class Client {

	public static void main(String[] args) {

		ShopFactory s = new GSShopFactory();

		PrimeAcc p = new GSPrimeAcc(201, " Nilesh", 1000, true);

		NormalAcc n = new GSNormalAcc(202, " Ashwin", 1001, 50);
		
		System.out.println(" Prime Account");
		
		p.bookProduct(p.getCharges());

		System.out.println(" Normal Account");
		
		p.bookProduct(n.getCharges());
		
		System.out.println(p);
		
		System.out.println(n);
	}
}
