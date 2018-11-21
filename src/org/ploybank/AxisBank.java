package org.ploybank;

public class AxisBank extends BankInfoo{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit account 100%");
	}

	public void recurdep() {
		// TODO Auto-generated method stub
System.out.println("RD account Nil");
	}
	public static void main(String[] args) {
		AxisBank ds=new AxisBank();
		ds.deposit();
		ds.saving();
		ds.fixed();
		ds.recurdep();
	}
}
