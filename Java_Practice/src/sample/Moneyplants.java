package sample;

public class Moneyplants extends Plants{
	public void flower() {
		System.out.println("flowers are red");
	}
	
     public static void main(String[] args) {
    	 Moneyplants obj = new Moneyplants();
    	 obj.flower();
    	 obj.fruits();
     }
}
