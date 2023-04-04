package sample;

public class Loading {
	void go(double a,int b) {
		
		
		System.out.println("enter the numbers:" +(a+b));
	}
	void go(int a,int b,int c) {
		System.out.println("enter the :" + (a *b *c));
	}

	public static void main(String[] args) {
		Loading obj = new Loading();
		obj.go(3,5, 8);
		obj.go(5.9, 8);
		

	}

}
