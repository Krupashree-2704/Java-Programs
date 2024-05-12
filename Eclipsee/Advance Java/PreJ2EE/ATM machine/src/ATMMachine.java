import java.util.Scanner;

public class ATMMachine {
	static Scanner sc=new Scanner(System.in);
	float balance;
	int pin=5678;
	public void checkpin()
	{
		System.out.println("Enter your pin:");
		int userPin=sc.nextInt();
		sc.nextLine();
		if (userPin==pin) {
			menu();
		} else {
			System.out.println("Enter a valid pin");
			checkpin();
		}
		
	}
	public void menu()
	{
		System.out.println("1.Check Balance\n2.Withdraw Money\n3.deposit Money\n4.Exit\nEnter your Choice:");
		int opt=sc.nextInt();
		if (opt==1) {
			checkBalance();
		} else if (opt==2) {
			withdrawMoney();
		}else if (opt==3) {
			depositMoney();
		}else if(opt==4){
			return;
		}
		else
		{
			System.out.println("Invalid Choice!!!");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Your Balance is:"+balance);
		menu();
	}
	public void withdrawMoney()
	{
		System.out.println("Enter Amount to Withdraw:");
		float amount_withdraw=sc.nextFloat();
		if (amount_withdraw>balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance=balance-amount_withdraw;
			System.out.println("Monet Withdrawned Sucessfully");
		
		}
		menu();
	}
	public void depositMoney()
	{
		System.out.println("Enter Amount to Deposit:");
		float amount_deposit=sc.nextFloat();
		balance=balance+amount_deposit;
		System.out.println("Amount Deposited Successfully");
		menu();
	}
	public static void main(String[] args) {
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.checkpin();

	}

}
