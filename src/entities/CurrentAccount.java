package entities;

public class CurrentAccount extends Account {

	public CurrentAccount(Customer customer) {
		super(customer);
	}

	@Override
	public void printAccountStatement() {

		System.out.println("=== Current Account Statement ===");
		System.out.println(super.toString());
	}
}
