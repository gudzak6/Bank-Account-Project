package bankAccountApplication;

public class Savings extends Account{
	// list properties to savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	
		//initialize savings account
		public Savings(String name, String sSN, double initDeposit){
			super(name, sSN, initDeposit);
			accountNumber = "1" + accountNumber;
			
		}
		//list methods to account
}
