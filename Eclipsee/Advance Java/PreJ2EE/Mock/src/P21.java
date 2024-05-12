
class BankAccount {
	private int accountNumber;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}


public class P21 {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		acc1.setAccountNumber(111);
		acc1.setBalance(200.10);
		BankAccount acc2 = new BankAccount();
		acc2.setAccountNumber(112);
		acc2.setBalance(201.10);
		System.out.println("For account 1");
		System.out.println(acc1.getAccountNumber());
		System.out.println(acc1.getBalance());
		System.out.println("For account 2");
		System.out.println(acc2.getAccountNumber());
		System.out.println(acc2.getBalance());

	}

}
