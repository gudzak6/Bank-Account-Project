package bankAccountApplication;

public abstract class Account implements IBaseRate {
	//List Common properties for savings and checking
	String name;
	String socialSecurity;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	//Constructor to set base properties and initialize account
	public Account(String name, String socialSecurity, double initDeposit){
		this.name = name;
		this.socialSecurity = socialSecurity;
		balance = initDeposit;
		System.out.println("Name: " + name + " socialSecurity: " + socialSecurity + " Balance: " + balance);
		
		//Set account number
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("Account number: " + this.accountNumber);
	}
		private String setAccountNumber(){
			String lastTwoOfsocialSecurity = socialSecurity.substring(socialSecurity.length()-2, socialSecurity.length());
			int uniqueId = index;
			int randomNumber = (int) (Math.random() * Math.pow(10, 3));
			return lastTwoOfsocialSecurity + uniqueId + randomNumber;
		}
	
	//List common methods
		public void showInfo(){
			System.out.println(
					"Name " + name + 
					"\nAccountNumber " + accountNumber + 
					"\nBalance " + balance 
					);
			
		}
	
}
