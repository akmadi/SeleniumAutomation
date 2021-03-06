package com.anil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate dt = LocalDate.now();
		System.out.println(dt);

		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-YYYY HH-mm-ss ");
		String formattedDate = ldt.format(dtf);

		System.out.println("Data after formatting: " + formattedDate);

	}

}
