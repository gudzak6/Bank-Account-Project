package bankAccountApplication;

public class Checking extends Account {
	// list properties to checking account
	int debitCardNumber;
	int debitCardPin;
	
	//initialize checking account
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		
	}
	//list methods to account
}
