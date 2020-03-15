public class CashRegister {
	
	//fields
	private static int count = 0;
	private int transactions;
	private double runningTotal;
	
	//constructor
	public CashRegister() {
		count++;
		this.transactions = 0;
		this.runningTotal = 0;
	}
	
	//adds amount to runningTotal and increments # of transactions
	public void addTransaction(double amount) {
		this.transactions++;
		this.runningTotal += amount;
	}
	
	//returns # of transactions received
	public int transactionCount() {		
		return this.transactions;
	}
	
	//returns sum of transaction amounts
	public double total() {		
		return this.runningTotal;
	}
	
	//sets total amount and transaction count to 0 
	public void resetTransactions() {		
		this.transactions = 0;
		this.runningTotal = 0;
	}
	
	//returns number of cash registers created to 0
	public static int registerCount() {		
		return count;
	}
	
}
