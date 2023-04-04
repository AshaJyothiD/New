package sample;

public class Bank {
	  static int balance = 1000;
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("The current balance is after deposit:" + balance);
		
	}
	public static void withdrawl(int amount) {
		balance = balance - amount;
		System.out.println("The current balance is after withdrawl:" +balance);
	}
	public int getcurrentBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(1200);
		withdrawl(500);
		System.out.println("the leftover balance:"  + balance);
		
		

	}

}
