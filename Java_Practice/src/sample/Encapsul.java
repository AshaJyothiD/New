package sample;

public class Encapsul {
	private  double balance;
	public void setbalance(double newbalance) {
		if(newbalance >=0) {
			balance = newbalance;
		}
	}
		public double getbalance() {
			return balance;
		}
	

	public static void main(String[] args) {
		Encapsul bank = new Encapsul();
		bank.setbalance(1000.0);
	
			System.out.println("my balance "+bank.getbalance());
		}
		

	}



