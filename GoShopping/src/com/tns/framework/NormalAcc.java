package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {

	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	public void bookProduct(float charges) {
	
		System.out.println("Account number is " + this.getAccNo() + " Account name is: " + this.getAccNm() + " "
				+ "Charges is : " + (charges + deliveryCharges));
	}

	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s], toString()=%s", deliveryCharges, super.toString());
	}

}
