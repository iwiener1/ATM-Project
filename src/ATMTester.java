
public class ATMTester {

	public static void main(String[] args) {
		ATM machine = new ATM();
		System.out.println(machine.checkBalance(111111111));
		machine.openAccount(111111111);
		machine.depositMoney(111111111,7.23);
		System.out.println(machine.checkBalance(111111111));
		machine.withdrawMoney(111111111, 4.23);
		System.out.println(machine.checkBalance(111111111));
	}

}
