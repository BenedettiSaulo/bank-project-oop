package entities;

import java.util.ArrayList;
import java.util.List;

import entities.interfaces.BankInterface;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank implements BankInterface {

	private String name;
	private List<Account> accounts = new ArrayList<Account>();;

	@Override
	public void addAccount(Account account) {

		this.accounts.add(account);
	}

	@Override
	public void listAccount() {

		String title = String.format("==== %s Accounts ====", this.name);

		System.out.println(title);
		System.out.println(acquireDashedLine(title.length()));

		this.accounts.forEach(acc -> acc.printAccountStatement());
	}

	private String acquireDashedLine(int length) {

		StringBuilder line = new StringBuilder();

		for (int i = 0; i < length; i++) {

			line.append("=");
		}

		return line.toString();
	}
}
