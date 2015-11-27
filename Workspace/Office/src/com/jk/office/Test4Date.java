package com.jk.office;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4Date {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy:hh:mmaaa");
		String dateString = "11-Apr-2015/02/33AM";
		String actStrg = dateString.replace('/', ':');
		System.out.println(actStrg);
		try {
			Date d = format.parse(actStrg);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
