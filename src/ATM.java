import java.util.*;

public class ATM {
	private HashMap<Integer, Double> accounts;
	
	
	public ATM(){
		accounts = new HashMap<Integer, Double>();
	}
	
	public void openAccount(Integer idNum) {
		if (!accounts.containsKey(idNum)) {
			accounts.put(idNum, 0.0);
		}
		else {
			System.out.println("Account creation failed. An account with that ID already exists.");
		}
		
	}
	
	public void openAccount(Integer idNum, double initBalance) {
		if (!accounts.containsKey(idNum)) {
			accounts.put(idNum, initBalance);
		}
		else {
			System.out.println("Account creation failed. An account with that ID already exists.");
		}
	}
	
	public void closeAccount(Integer idNum) {
		if (accounts.containsKey(idNum)){
			accounts.remove(idNum,0);
		}
	}
	
	public double checkBalance(Integer idNum) {
		if (accounts.containsKey(idNum)) {
			return accounts.get(idNum);
		}
		return 0.0;
	}
	
	public boolean depositMoney(Integer idNum, double amount) {
		if (accounts.containsKey(idNum)&&amount>=0) {
			accounts.replace(idNum,accounts.get(idNum)+amount);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney(Integer idNum, double amount) {
		if (accounts.containsKey(idNum)&&amount>=0&&accounts.get(idNum)>=amount) {
			accounts.replace(idNum,accounts.get(idNum)-amount);
			return true;
		}
		return false; 
	}
}
