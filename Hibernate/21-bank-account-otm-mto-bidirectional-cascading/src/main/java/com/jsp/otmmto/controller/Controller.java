package com.jsp.otmmto.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//import com.jsp.ba.model.Accounts;
import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;

public class Controller {
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public  boolean insert_bank_and_account(Bank bank,List <Account> accounts)
	{
		if (bank!=null&&accounts!=null) {
			entityTransaction.begin();
			entityManager.persist(bank);
			for (Account account : accounts) {
				entityManager.persist(account);
			}
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public void search_bank_and_its_details(int bank_no)
	{
		Bank findBank = entityManager.find(Bank.class, bank_no);
		if (findBank!=null) {
			System.out.println(findBank.getId());
			System.out.println(findBank.getName());
			System.out.println(findBank.getLocation());
			List<Account> accounts = findBank.getAccounts();
			for (Account account : accounts) {
				System.out.println("Account ID:"+account.getId());
				System.out.println("Account ID:"+account.getAccount_holder_name());
				System.out.println("Account ID:"+account.getBalance());
			}
		}
	}
	public void search_account_and_its_details(int account_no)
	{
		Account account = entityManager.find(Account.class, account_no);
		if (account!=null) {
			System.out.println(account.getId());
			System.out.println(account.getAccount_holder_name());
			System.out.println(account.getBalance());
			Bank bank = account.getBank();
			if (bank!=null) {
				System.out.println(bank.getId());
				System.out.println(bank.getName());
				System.out.println(bank.getLocation());
			}
		}
	}
	public List<Bank> enlist_bank()
	{
		TypedQuery<Bank> query = entityManager.createQuery("SELECT s FROM Bank s", Bank.class);
		return query.getResultList();
	}
	public List<Account> enlist_account()
	{
		TypedQuery<Account> query = entityManager.createQuery("SELECT s FROM Account s", Account.class);
		return query.getResultList();
	}
	public boolean updateBanklocation(int bank_id,String bankLocation)
	{
		Bank findBank = entityManager.find(Bank.class, bank_id);
		if (findBank!=null) {
			entityTransaction.begin();
			findBank.setLocation(bankLocation);
			entityManager.merge(findBank);
			entityTransaction.commit();
			return true;
			
		}
		return false;
	}
	public boolean updateAccountBalance(int account_id,double account_balance)
	{
		Account findAccount = entityManager.find(Account.class, account_id);
		if (findAccount!=null) {
			entityTransaction.begin();
			findAccount.setBalance(account_balance);
			entityManager.merge(findAccount);
			entityTransaction.commit();
			return true;
			
		}
		return false;
	}
	public boolean removeAccount(int primaryKey)
	{
		Bank findBank = entityManager.find(Bank.class, primaryKey);
		if (findBank!=null) {
			List<Account> accounts = findBank.getAccounts();
			entityTransaction.begin();
			entityManager.remove(findBank);
			for (Account accounts2 : accounts) {
				entityManager.remove(accounts2);
			}			
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Bank ID does not exists");
		}
		return false;
	}
}
