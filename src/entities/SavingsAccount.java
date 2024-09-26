package entities;

public class SavingsAccount extends Account {

	public SavingsAccount(Customer customer) {
		super(customer);
	}

	@Override
	public void printAccountStatement() {

		System.out.println("=== Savings Account Statement ===");
		System.out.println(super.toString());
	}
}
