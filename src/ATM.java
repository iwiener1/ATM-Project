import java.util.*;

public class ATM {
	private HashMap<Integer, Double> accounts;
	
	
	public ATM(){
		accounts = new HashMap();
	}
	
	public void openAccount(Integer idNum) {
		accounts.put(idNum, 0.0);
	}
	
	public void openAccount(Integer idNum, double initBalance) {
		accounts.put(idNum, initBalance);
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
		if (accounts.containsKey(idNum)) {
			accounts.replace(idNum,accounts.get(idNum)+amount);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney(Integer idNum, double amount) {
		if (accounts.containsKey(idNum)&&accounts.get(idNum)>=amount) {
			accounts.replace(idNum,accounts.get(idNum)-amount);
			return true;
		}
		return false; 
	}
}
