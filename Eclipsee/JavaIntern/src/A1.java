import java.util.HashMap;
import java.util.Scanner;

abstract class ATM{
		static Scanner sc=new Scanner(System.in);
		public static HashMap <Double,String>h1=new HashMap<Double, String>();
		private double balance;
		public static void main(String[] args) {

			while(true)
			{
				System.out.println("*************************Welcome To ABC Co-op Bank Ltd*************************");
			System.out.println("1.Check Balance\n2.Deposit\n3.WithDrawal\n4.Check History\n5.Exit");
			System.out.println("Please Enter Your Choice!!!");
			int choice=sc.nextInt();
			if(choice==1)
			{
				Withdraw w=new Withdraw();
				w.withdrawMoney();
			}
			
			else if(choice==2)
			{
				Deposit d=new Deposit();
				d.depositMoney();
			}
			else if(choice==3)
			{

				Transfer tr=new Transfer();
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
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
 }
public class A1 {

	public static void main(String[] args) {
	

	}

}
