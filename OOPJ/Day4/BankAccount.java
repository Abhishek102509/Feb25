class BankAccount1{

	double balance;
	
	public void deposit(double balance)
	{
		this.balance = balance;
		
	}
	
	public void withdraw(double withdraw)
	{
		balance = balance-withdraw;
		
	}
	
	public void checkbal()
	{
		System.out.println(balance);
		
	}
}

class BankAccount{
	public static void main (String arg[]){
		BankAccount1 bl = new BankAccount1();
		bl.deposit(15105.5);
		bl.withdraw(1505.5);
		bl.checkbal();
		
	}
	
}