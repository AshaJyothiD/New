package sample;

public class Angle {
	int length ;
	int width ;
	
	void Area(int l ,int w) {
		 length =l;
		 width = w;
		  
		
	}
	void display() {
		System.out.println("the length and width is:" + (length*width) );
	}
	public static void main(String[] args) {
		Angle obj = new Angle(),obj1 = new Angle();		//Angle obj= new Angle(),obj1=new Angle();
		//Angle obj1 = new Angle();
		obj.Area(5, 6);
		obj1.Area(6, 8);
		
		obj.display();
		obj1.display();
	}
}
	
		




