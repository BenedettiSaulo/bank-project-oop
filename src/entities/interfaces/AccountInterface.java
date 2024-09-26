package entities.interfaces;

import entities.Account;

public interface AccountInterface {

	public abstract void withdraw(double value);

	public abstract void deposit(double value);

	public abstract void transfer(double value, Account targetAccount);

	public abstract void printAccountStatement();
}
