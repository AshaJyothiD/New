package sample;

public class Overloading {
	//int a; //instance variables = outside the method and inside the class
	//String b;
	
	Overloading(int a,String b){ 
		//constructor = special method used to intiliaze the object
		//id =a;
		//name =b;
		System.out.println("the result is:" + (a+b));
	}
	Overloading(int a,int b, String c){
		System.out.println("overloading:" +a +b +c);
	}
	//void display() {
		//System.out.println("asha");
	//}
	public static void main(String[] args) {
		Overloading obj1 = new Overloading(2,"asha"),obj2 = new Overloading(3,4,"jyothi");
		//obj1.display();
	}
	

}
