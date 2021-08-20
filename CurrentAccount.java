package assignment;

public class CurrentAccount implements BankAccount {

	@Override
	public void checkBankBalance() {
		

		System.out.println("this is from current account to check bank balance");
	}

	

	@Override
	public void validateUser() {
		
		System.out.println("this is from current account to valid user");
		
	}

}
