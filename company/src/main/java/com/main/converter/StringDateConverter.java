package com.main.converter;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class StringDateConverter{

	
	public LocalDate convertToDate(String attribute) {
		LocalDate date = LocalDate.parse(attribute);//2007-12-03
		return date;
	}

	public String convertToString(LocalDate dbData) {
		String s = dbData.toString();
		return s;
	}

}
