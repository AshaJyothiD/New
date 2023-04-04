package sample;

public class Dconstructor {
	String name;
	int id;
	
	void display() {
		System.out.println("default constructor is:" + name);
	}
	

	public static void main(String[] args) {
	  Dconstructor obj1 = new Dconstructor(),obj2 = new Dconstructor();
	  System.out.println("obj1:" + obj1.name);
	  System.out.println("obj2:" +obj2.id);
	  obj1.display();

	}

}
