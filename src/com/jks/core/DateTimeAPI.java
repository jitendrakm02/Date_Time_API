package com.jks.core;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LocalDate Class
		System.out.println("LocalDate class example......");
		
		LocalDate ldate1=LocalDate.parse("2021-03-05");
		LocalDate ldate2=LocalDate.parse("2022-06-08");
		
		long days=Period.between(ldate1, ldate2).getDays();
		long months=Period.between(ldate1, ldate2).getMonths();
		long months1=Period.between(ldate1, ldate2).toTotalMonths();
		long years=Period.between(ldate1, ldate2).getYears();
		
		long day=ChronoUnit.DAYS.between(ldate1, ldate2);
		long month=ChronoUnit.MONTHS.between(ldate1, ldate2);
		long month1=ChronoUnit.MONTHS.between(ldate1, ldate2);
		long year=ChronoUnit.YEARS.between(ldate1, ldate2);
		
		System.out.println(ldate1+" , "+ldate2+" Days : "+days+" Months : "+months+" Total Months :"+months1+" Years : "+years);
		System.out.println(ldate1+" , "+ldate2+"  Day : "+day+" Month : "+month+" Total Month : "+month1+" Year : "+year);
		
		
		//LocalTime Class
		System.out.println("Local Time class started");
		
		LocalTime ltime1=LocalTime.of(20, 35);
		LocalTime ltime2=LocalTime.of(23, 15);
		
		Duration duration=Duration.between(ltime1, ltime2);
		
		System.out.println("Difference of Duration :"+duration);
		System.out.println("Difference of Duration in Hr. :"+duration.toHours());
		System.out.println("Difference of Duration Min.:"+duration.toMinutes());
		
		LocalTime firstTime = LocalTime.of(10, 15, 45);
		LocalTime secondTime = LocalTime.of(14, 50, 15);

		// calculate difference between times
		long hours = ChronoUnit.HOURS.between(firstTime, secondTime);
		long minutes = ChronoUnit.MINUTES.between(firstTime, secondTime);
		long seconds = ChronoUnit.SECONDS.between(firstTime, secondTime);

		// print the difference
		System.out.println("Hours between " + firstTime + " and " + secondTime + ": " + hours);
		System.out.println("Minutes between " + firstTime + " and " + secondTime + ": " + minutes);
		System.out.println("Seconds between " + firstTime + " and " + secondTime + ": " + seconds);
		
		
		//LocalDateTime class
		
		System.out.println("Local Date Time class......");
		// create datetime instances
		LocalDateTime dateTime1 = LocalDateTime.parse("2018-08-02T15:14");
		LocalDateTime dateTime2 = LocalDateTime.parse("2019-02-14T12:45");

		Duration dur=Duration.between(dateTime1, dateTime2);
		
		System.out.println("hours :"+dur.toHours());
		System.out.println("Minutes : "+dur.toMinutes());
		System.out.println("seconds : "+dur.toSeconds());
		System.out.println("Days : "+dur.toDays());
		System.out.println("Mili seconds : "+dur.toMillis());
		

	}

}
