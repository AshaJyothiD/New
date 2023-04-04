package sample;


	import java.time.LocalDate;
	import java.time.DayOfWeek;

	public class chatgpt {

	    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        DayOfWeek dayOfWeek = today.getDayOfWeek();

	        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
	            System.out.println("It's the weekend!");
	        } else {
	            System.out.println("It's a weekday.");
	        }
	    }
	}


