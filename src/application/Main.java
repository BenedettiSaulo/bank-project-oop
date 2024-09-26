package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.Bank;
import entities.CurrentAccount;
import entities.Customer;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Customer customerOne = new Customer();
		customerOne.setName("Saulo");

		Customer customerTwo = new Customer();
		customerTwo.setName("Pablo");

		Account currentAccountCustomerOne = new CurrentAccount(customerOne);
		Account savingsAccountCustomerOne = new SavingsAccount(customerOne);

		Account savingsAccountCustomerTwo = new SavingsAccount(customerTwo);

		currentAccountCustomerOne.deposit(100);
		currentAccountCustomerOne.transfer(100, savingsAccountCustomerOne);

		currentAccountCustomerOne.printAccountStatement();
		savingsAccountCustomerOne.printAccountStatement();

		savingsAccountCustomerTwo.deposit(10023.51);
		savingsAccountCustomerTwo.transfer(23.51, currentAccountCustomerOne);

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(currentAccountCustomerOne);
		accounts.add(savingsAccountCustomerOne);

		Bank bank = new Bank();
		bank.setName("Best Bank");
		bank.setAccounts(accounts);

		bank.addAccount(savingsAccountCustomerTwo);

		bank.listAccount();
	}
}
