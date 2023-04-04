package sample;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	public  Employee(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary ;
	}
	public void setname(String name) {
		this.name = name;
	}
	public  String getname() {
		return name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public  int getage() {
		return age;
	
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}
	public double getsalary() {
		return salary;
	}

	public static void main(String[] args) {
	    Employee employee1 = new Employee("asha",35,67890.5);
	    Employee  employee2 = new Employee("Jyothi",40,45670.8);
	    
	    System.out.println("my name is:" +employee1.getage());

    }
}
