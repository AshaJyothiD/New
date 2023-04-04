package sample;

public class Bankaccount {
	private double balance;
	public void setbalance(double newbalance) {
		if (newbalance>0) {
			balance = newbalance;
		}
	}
		public double getbalance() {
			return balance;
		}
	

	public static void main(String[] args) {
		Bankaccount account = new Bankaccount();
		account.setbalance(10000.0);
		System.out.println("balance is:" + account.getbalance());

	}

}
