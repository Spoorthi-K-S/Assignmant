package assignment;

public class CurrentAccount implements BankAccount {

	@Override
	public void checkBankBalance() {
		// TODO Auto-generated method stub

		System.out.println("this is from current account to check bank balance");
	}

	

	@Override
	public void validateUser() {
		// TODO Auto-generated method stub
		System.out.println("this is from current account to valid user");
		
	}

}
