package sample;

public class Record {
	void num(int a,int b) { 
		int sum=a+b;
		
		System.out.println( sum);
		
	}
	
	public static void main(String[] args) {
		Record obj = new Record();
		 obj.num(5, 5);
		//System.out.println("the addition is:" + numbers);
	}
	

}