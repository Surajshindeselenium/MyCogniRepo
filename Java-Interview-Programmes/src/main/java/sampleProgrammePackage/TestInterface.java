package sampleProgrammePackage;

public class TestInterface {

	public static void main(String[] args) {

		HDFCBank hd = new HDFCBank();
		hd.credit();
		hd.debit();
		hd.homeLoan();
		hd.moneyTransfer();
		hd.mutualFund();

		System.out.println("Dynamic Polymorprism");

		USBank us = new HDFCBank();
		us.credit();
		us.debit();
		us.moneyTransfer();
		System.out.println(USBank.min_bal);

	}

}
