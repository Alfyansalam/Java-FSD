package java8;

import java.time.LocalDateTime;

public class date {

	public static void main(String[] args) {
		 date j = new date();
	      j.testLocalDateTime();
	}
	public void testLocalDateTime() {
	      
	      LocalDateTime l = LocalDateTime.now();
	      System.out.println("Current date: " + l.toLocalDate());
	      System.out.println("Current time: " + l.toLocalTime());
	}
}
