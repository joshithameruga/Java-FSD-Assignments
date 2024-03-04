package abstraction;

public class BankImpl implements Bank {
       
	public void withDraw() {
		System.out.println("amount withdrawn");
	}
	
	public void deposit() {
		System.out.println("amount deposited");
	}
}
