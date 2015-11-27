package com.jk.office;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {
	
	public static void main(String[] args) throws Exception{
		
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		//"yyMMddHHmmssZ"
		SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
		Date date2 = fmt.parse("05/04/2015");
		cal2.setTime(date2);
		BigDecimal decimal2 = new BigDecimal(cal2.getTimeInMillis());
		BigDecimal decimal = new BigDecimal(cal.getTimeInMillis());
		BigDecimal timeUnit = new BigDecimal(60 * 60 * 1000);
		
		System.out.println((decimal2.subtract(decimal).divide(timeUnit,2, RoundingMode.HALF_UP)));//.divide(timeUnit)
		
		BigDecimal delta = decimal2.subtract(decimal);
		//if(delta.doubleValue() > .01)
		
		
		//Calendar ca = Calendar.getInstance();
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
