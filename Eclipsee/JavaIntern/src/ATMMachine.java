import java.util.*;
import java.util.Map.Entry;
public class ATMMachine {
	private double balance;
	private double withdraw;
	private double deposit;
	private double transfer;
    Scanner sc=new Scanner(System.in);
    HashMap<Double, String> h=new HashMap<Double, String>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int atmpin=123;
		int accno=123345;
		System.out.println("Enter Pin : ");
		int pin=sc.nextInt();
		System.out.println("Enter Account Number : ");
		int acno=sc.nextInt();
		ATMMachine a=new ATMMachine();
	
		
		if(pin==atmpin &&acno==accno)
		{
			
		
		while(true)
		{
			System.out.println("*************************Welcome To ABC Co-op Bank Ltd*************************");
		System.out.println("1.Check Balance\n2.Deposit\n3.WithDrawal\n4.Check History\n5.Exit");
		System.out.println("Please Enter Your Choice!!!");
		int choice=sc.nextInt();
		if(choice==1)
		{
			a.checkBal();
		}
		else if(choice==2)
		{
			a.depositMoney();
		}
		else if(choice==3)
		{
			a.withdrawMoney();
		}
		else if(choice==4)
		{
			a.checkHistory();
		}
		else if(choice==5)
		{
			break;
		}
		else {
			System.out.println("Invalid Choice!!!!");
		}
		
		
		
		}
		}
		System.out.println("Thank You");
		

	}


	public  double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public double getTransfer() {
		return transfer;
	}


	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}
	public void checkBal()
	{
		h.put(balance,"Available Balance");
		System.out.println("Available Balance is : "+balance);
	}
	public void withdrawMoney()
	{
		
		System.out.println("Enter Amount to be Withdraw : ");
		withdraw=sc.nextDouble();
		h.put(withdraw, "Amount Withdrawned");
		if(withdraw>getBalance())
		{
			System.out.println("Sorry You Don't have Sufficient Balance!!!!");
		}
		else
		{
			setBalance(getBalance()-withdraw);
			System.out.println(withdraw+"Amount Withdrawned Successfully !!!!!");
			System.out.println("Available Balance is : "+balance);
		}
		
	}
	public void depositMoney()
	{
		System.out.println("Enter Amount to be Deposited : ");
		deposit=sc.nextDouble();
		h.put(deposit, "Amount Deposited");
		setBalance(getBalance()+deposit);
		System.out.println(deposit+"Amount Deposited Successfully!!!!");
		System.out.println("Available Balance is : "+balance);
		
	}
	public void checkHistory()
	{
		Set<Entry<Double, String>> s=h.entrySet();
		System.out.println("***********Account Transaction History***********");
		System.out.println(s);
}
	
}
