
public class Runner
	{

		public static void main(String[] args)
			{
			BankAccount b = new BankAccount();
			b.getBalance();
			SavingsAccount s = new SavingsAccount();
			s.getBalance();
			CheckingAccount c = new CheckingAccount();
			c.getBalance();
			BankAccount b = new CheckingAccount();
			b.getBalance();
			BankAccount b = new SavingsAccount();
			b.getBalance();
			
			}

	}
