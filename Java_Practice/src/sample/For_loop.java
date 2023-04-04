package sample;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class For_loop {
			public static void main(String[] args) {
				LocalDate today = LocalDate.now();
				DayOfWeek dayofweek = today.getDayOfWeek();
			
			if(dayofweek == dayofweek.SATURDAY || dayofweek == dayofweek.SUNDAY)
			{
		    System.out.println("it is weekend");
			} else {
		    	System.out.println("it is weekday");
		    }

	}
}


