package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		DayOfWeek dayOfweek = currDate.getDayOfWeek(); // getDayOfWeek(); returns a DayOfWeek instance
		
		int dayOfMonth = currDate.getDayOfMonth();
		int dayOfYear = currDate.getDayOfYear();

		System.out.println("Date: " + currDate);
		System.out.println("Day of Week: " + dayOfweek);
		System.out.println("Day of Month: " + dayOfMonth);
		System.out.println("Day of Year: " + dayOfYear);
	}
}
