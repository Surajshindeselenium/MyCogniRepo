package sampleProgrammePackage;

public class HDFCBank implements USBank,FranceBank {

	public void mutualFund() {

		System.out.println("France Bank mutual fund");
		
	}

	public void credit() {

		System.out.println("US Bank credit");
		
	}

	public void debit() {
		System.out.println("US Bank debit");
		
	}

	public void moneyTransfer() {
		System.out.println("US Bank momeyTransfer");
		
	}
	public void homeLoan() {
		System.out.println("HDFC bank home loan");
	}

}
