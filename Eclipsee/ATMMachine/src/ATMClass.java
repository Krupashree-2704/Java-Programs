import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class ATMClass {

	
		 public static String name;
		 public static double balance=0.0;
		 public static int userid;
		 public static int userpin;
		 public static LinkedHashMap h=new LinkedHashMap();
		    
		
		public static void main(String[] args) {
			homepage();

		}
		public static void homepage()
		{
			 	System.out.println("\033[H\033[2J");
		        Scanner sc=new Scanner(System.in);
		        System.out.println("----------------------------WELCOME TO ATM INTERFACE----------------------------");
		        System.out.println("--------------------------------------------------------------------------------");
		        System.out.println("--------------------------------------------------------------------------------");
		        System.out.println("select option :");
		        System.out.println("1. Register");
		        System.out.println("2. Exit");
		        System.out.println("Enter choice");
		        int choice =sc.nextInt();
		        switch(choice)
		        {
		        case 1:
		        	Bankaccount.register();
		        	break;
		        case 2:
		        	Systemexit.sysexit();
		        	break;
		        default:
		        	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Invalid Choice!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		        	homepage();
		        	
		        		
		        }
		        
		            
		  	}
		public static void prompt()
		{
			if(Bankaccount.login(userid,userpin))
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("************************************************************************************");
				System.out.println("************************************************************************************");
				System.out.println("************************************************************************************");
				System.out.println("************************************************************************************");
				System.out.println("*******************************************WELCOME "+ATMClass.name+"! TO ABC Co-Op Bank Ltd*******************************************");
				System.out.println("Select option : ");
		        System.out.println("1. Withdraw");
		        System.out.println("2. Deposit");
		        System.out.println("3. Transfer");
		        System.out.println("4. Check balance");
		        System.out.println("5. Transaction History");
		        System.out.println("6. Exit");
		        System.out.print("Enter your choice : ");
		        int choice=sc.nextInt();
		        if(choice==1)
		        {
		        	 TransactionD.withdraw();
		        }
		        else if(choice==2)
		        {
		        	 TransactionD.deposit();
		        }
		        else if(choice==3)
		        {
		        	TransactionD.transfer();
		        }
		        else if(choice==4)
		        {
		        	CheckBal.checkbalance();
		        }
		        else if(choice==5)
		        {
		        	HistoryTrans.transactionHistory();
		        }
		        else if(choice==6)
		        {
		        	Systemexit.sysexit();
		        }
		        else {
		        	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!Invalid Choice!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		        }
		        			
			}
		
			else
			{
				System.exit(0);
			}

}
		public static void showbalance() {
			System.out.println(balance);
			
		}
}
class Bankaccount{

	public static void register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		ATMClass.name=sc.next();
		System.out.println("Enter your UserID : ");
		ATMClass.userid=sc.nextInt();
		System.out.println("Enter your PIN : ");
		ATMClass.userpin=sc.nextInt();
		System.out.println("Enter your Account Number : ");
		int acc=sc.nextInt();
		int user=ATMClass.userid;
		int pin=ATMClass.userpin;
		System.out.println("******************************Registeration Sucessfully Done******************************");
		System.out.println("******************************************************************************************");
		ATMClass.prompt();
		while(true){
            display(ATMClass.name);
            int choice=sc.nextInt();
            switch(choice)
            {
            	case 1:
            		login(user,pin);
            		break;
            	case 2:
            		Systemexit.sysexit();//exit function
            		break;
            	default:
            		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Invalid Value!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            		break;
            }
        }
    }
    static void display(String name){}
    static boolean login(int user,int pin){
    	Scanner Sc = new Scanner(System.in);
		boolean islogin = false;

		while (!islogin) {
			System.out.println("Enter Your UserID  - ");
			int userid = Sc.nextInt();
			if (userid==user) {
				while (!islogin) {
					System.out.println("Enter Your PIN  - ");
					int userpin = Sc.nextInt();
					if (userpin==pin) {
						System.out.println("Login Successful ");
						islogin = true;

					} else {
						System.out.println("Incorrect PIN !!");
					}

				}

			} else {
				System.out.println("UserID Not Found !!");
			}

		}

		return islogin;
	
    }
}
class TransactionD{
    static void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Enter Amount to Withdraw :");
        int wcash=sc.nextInt();
        if(wcash<=ATMClass.balance){
            ATMClass.balance=ATMClass.balance-wcash;
            ATMClass.h.put(wcash, "Amount Withdrawned");
            System.out.println("-----------------------Amount Rs"+wcash+"/-withdraw successfully-----------------------");
            System.out.println("---------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Insufficient Balance to Withdraw the cash!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        ATMClass.prompt();
    }
    static void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Enter Amount to Deposit :");
        int dcash=sc.nextInt();
        ATMClass.balance=ATMClass.balance+dcash;
        ATMClass.h.put(dcash, "Amount Deposited");
        System.out.println("--------------------------Amount Rs."+dcash+"/- deposit successfully--------------------------");
        System.out.println("----------------------------------------------------------------------------------------------");
        ATMClass.prompt();
    }
    static void transfer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of Person to whom we have to Transfer the Amount : ");
        String s=sc.nextLine();
        System.out.println("Enter the Account Number of the Tranferring Party : ");
        int num=sc.nextInt();
        System.out.println("Enter the Amount to be Transferred :");
        int tcash=sc.nextInt();
        if(tcash<=ATMClass.balance){
            ATMClass.balance=ATMClass.balance-tcash;
            ATMClass.h.put(tcash, "Amount Transferred");
            System.out.println("-----------------------Amount Rs."+tcash+"/- transferred successfully---------------------");
            System.out.println("------------------------------------------------------------------------------------------");
            ATMClass.prompt();
        }
        else{
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!Insufficient Balance to Transfer the Cash!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }
}
class CheckBal{
	static void checkbalance(){
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("The available balance in the bank account :");
        ATMClass.showbalance();
        System.out.println("----------------------------------------------------------------------------------------------");
        ATMClass.prompt();
    }
}
class HistoryTrans{
	public static void transactionHistory()
	{
		Set s=ATMClass.h.entrySet();
		System.out.println("Transaction History of "+ATMClass.name);
		System.out.println(s);
		ATMClass.prompt();
	}
}
		

class Systemexit{
	public static void sysexit()
	{
		System.out.println("----------------------------------Thank You----------------------------------");
		System.exit(0);
	}
}


