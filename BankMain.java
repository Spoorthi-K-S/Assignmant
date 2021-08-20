package assignment;

public class BankMain {
	
	public static void main(String[] args) {
	CurrentAccount c=new CurrentAccount();
	SavingsAccount s=new SavingsAccount();
	c.checkBankBalance();
	c.validateUser();
	s.checkBankBalance();
	s.validateUser();



	}
}
