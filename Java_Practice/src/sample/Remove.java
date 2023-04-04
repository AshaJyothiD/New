package sample;

public class Remove {
	public static void main(String[] args) {
		String str = "abc1234";
	     String numbers = str.replaceAll("[^a-z A-Z]", " ");
		System.out.println("The result is: " + numbers);
	}

}
