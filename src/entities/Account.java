package entities;

import entities.interfaces.AccountInterface;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class Account implements AccountInterface {

	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENTIAL = 1;

	private int agency;
	private int number;
	private double balance;
	protected Customer customer;

	public Account(Customer customer) {

		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENTIAL++;
		this.customer = customer;
	}

	@Override
	public void withdraw(double value) {

		this.balance -= value;
	}

	@Override
	public void deposit(double value) {

		this.balance += value;
	}

	@Override
	public void transfer(double value, Account targetAccount) {

		this.withdraw(value);

		targetAccount.deposit(value);
	}

	@Override
	public String toString() {

		StringBuilder text = new StringBuilder();
		text.append("Account\n");
		text.append(String.format("Holder: %s\n", this.customer.getName()));
		text.append(String.format("Agency: %d\n", this.agency));
		text.append(String.format("Number: %d\n", this.number));
		text.append(String.format("Balance: R$%.2f\n", this.balance));

		return text.toString();
	}

}
