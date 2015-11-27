package com.jk.office;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws Exception{
		
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		//"yyMMddHHmmssZ"
		SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date2 = fmt.parse("06/30/2015 2:45:00");
		Date date = fmt.parse("06/28/2015 00:00:00");
		cal.setTime(date);
		cal2.setTime(date2);
		BigDecimal decimal2 = new BigDecimal(cal2.getTimeInMillis());
		BigDecimal decimal = new BigDecimal(cal.getTimeInMillis());
		BigDecimal timeUnit = new BigDecimal(60 * 60 * 1000);
		
		System.out.println(decimal2.subtract(decimal).divide(timeUnit));//.divide(timeUnit)
		
		Calendar ca = Calendar.getInstance();
		//ca.add(Calendar.DATE, -2);
		//ca.add(Calendar.MILLISECOND, -199800000);
		//ca.add(Calendar.MILLISECOND, -114300000);
		/*ca.add(Calendar.MILLISECOND, -114720000);
		BigDecimal decima2 = new BigDecimal(ca.getTimeInMillis());
		BigDecimal decima = new BigDecimal(Calendar.getInstance().getTimeInMillis());
		System.out.println(decima.subtract(decima2).divide(timeUnit));//.divide(timeUnit)
		
		
		BigDecimal cml10 = new BigDecimal("19.87484721");
		BigDecimal cml3 = new BigDecimal("5.5689");
		System.out.println("cml: "+cml10.divide(cml3));*/
		/*Date d = ca.getTime();
		System.out.println(d);*/
		
		
	}

}
