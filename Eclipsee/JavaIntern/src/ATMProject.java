import java.util.*;
import java.util.Map.Entry;
public class ATMProject {
	public static double balance;
	static Scanner sc=new Scanner(System.in);
	public static HashMap <Double,String>h1=new HashMap<Double, String>();
	public static void main(String[] args) {

		while(true)
		{
			System.out.println("*************************Welcome To ABC Co-op Bank Ltd*************************");
		System.out.println("1.Check Balance\n2.Deposit\n3.WithDrawal\n4.Check History\n5.Exit");
		System.out.println("Please Enter Your Choice!!!");
		int choice=sc.nextInt();
		if(choice==1)
		{
			Transaction  w=new	Transaction ();
			w.withdrawMoney();
		}
		
		else if(choice==2)
		{
			Transaction  d=new	Transaction ();
			d.depositMoney();
		}
		else if(choice==3)
		{

			Transaction  tr=new	Transaction ();
			tr.transfer();
		}
		else if(choice==4)
		{
			TransactionHistory th=new TransactionHistory();
			th.transactionHistory();
			
		}
		else if(choice==5)
		{
			SystemExit se=new SystemExit();
			se.exitSystem();
			
		}
		else {
			System.out.println("Invalid Choice!!!!");
		}
		
		
		
		
		}

	}




}
class Transaction extends ATMProject{
	public static void depositMoney() {
		System.out.println("Enter Amount to be Deposited : ");
		double deposit=sc.nextDouble();
		ATMProject.balance=ATMProject.balance+deposit;
		h1.put(deposit , "Amount Deposited");
	}
	
	public static void withdrawMoney() {
		System.out.println("Enter Amount to be Withdrawned : ");
		double withdraw=sc.nextDouble();
		if(withdraw>ATMProject.balance)
		{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Insufficient Balance!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		else {
			ATMProject.balance=ATMProject.balance-withdraw;
			h1.put(withdraw , "Amount Withdraw");
		}
	}
	
	public void transfer()
	{
		
		double transfer;
		System.out.println("Enter Account Number : ");
		int ano=sc.nextInt();
		System.out.println("Enter Amount to be Transfer : ");
		transfer=sc.nextDouble();
		if(transfer>ATMProject.balance) {
			System.out.println("Sorry Transaction cannot take Place\n You Dont Have Sufficient Balance");
			
		}
		else {
			ATMProject.balance=ATMProject.balance-transfer;
			h1.put(transfer, "Amount Transfered!!!!");
		}
	}
}
	

class TransactionHistory extends ATMProject{
	public void transactionHistory()
	{
		System.out.println("##########################Transaction History##########################");
		Set<Entry<Double, String>> s=h1.entrySet();
		System.out.println(s);
		
		
		
		
		
		
	}
}
class SystemExit{
	public void exitSystem()
	{
		System.exit(0);
	}
}
