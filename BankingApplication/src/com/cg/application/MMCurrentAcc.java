package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float MinBal) {
		super(accNo, accNm, accBal, MinBal);
		
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}

}
