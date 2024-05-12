import java.util.ArrayList;

import com.jsp.ba.otmmto.bid.controller.AccountController;
import com.jsp.ba.otmmto.bid.controller.BankController;
import com.jsp.ba.otmmto.bid.model.Account;
import com.jsp.ba.otmmto.bid.model.Bank;

public class TEst {
	static BankController bc=new BankController();
	static AccountController ac=new AccountController();
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setId(1);
		bank.setName("Himachal");
		bank.setLocation("Lonavla");
		if (bc.insertBank(bank)) {
			System.out.println("Inserted");
	}
		ArrayList<Account> accounts=new ArrayList<Account>();
		System.out.println("How Many Accounts you want to insert:");
		int insert_account=1;
		while (insert_account>0) {
			Account account1=new Account();
			
			account1.setId(1);
			account1.setAccount_holder_name("Mona");
			account1.setBalance(200);
			
			accounts.add(account1);
			Bank readBank = bc.readBank(1);
			account1.setBank(readBank);
			accounts.add(account1);
			boolean accountInsert = ac.accountInsert(accounts);
			if (accountInsert) {
				System.out.println("Inserted a");
			} else {
				System.out.println("Not Inserted a");
			}
			
			insert_account--;					
		}
		}
	}
	


