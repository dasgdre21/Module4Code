public class Driver {
	
	//instantiates and tests CashRegister objects and methods
	public static void main(String[] args) {
		
		//instantiates a CashRegister object
		CashRegister one = new CashRegister();
		
		//instantiates another CashRegister object
		CashRegister two = new CashRegister();
		
		//tests methods with 1st object
		one.addTransaction(1.25);
		one.addTransaction(2.5);
		one.addTransaction(3.75);
		System.out.println("Transaction count: " + one.transactionCount());
		System.out.println("Total: " + one.total());
		
		one.resetTransactions();
		System.out.println("Transaction count: " + one.transactionCount());		
		System.out.println("Total: " + one.total());
		
		System.out.println();
		
		//tests methods with 2nd object
		two.addTransaction(4);
		two.addTransaction(5.25);
		two.addTransaction(6.5);
		System.out.println("Transaction count: " + two.transactionCount());
		System.out.println("Total: " + two.total());
		
		two.resetTransactions();
		System.out.println("Transaction count: " + two.transactionCount());		
		System.out.println("Total: " + two.total());
		
		System.out.println();
		
		//tests static method
		System.out.println("Register count: " + CashRegister.registerCount());
	}

}