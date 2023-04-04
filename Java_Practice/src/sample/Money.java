package sample;

public class Money {
	String paper;
	int coins;
	
	void pay(String p,int c) {
	 paper = p;
		coins = c;
	}
	void Display() {
		System.out.println(  paper +" " + coins);
	}
	public static void main(String[] args) {
		Money m1 = new Money();
		Money m2 = new Money();
		m1.pay("ad",1);
		m2.pay("Aryan", 222);
		m1.Display();
		m2.Display();
		
		
		



  }
 }



