package com.ultramain.um21.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateForm {
	public static void main(String[] args) {
		Date mydate=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("yy/m/dd h:mm a ");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("h:mm:ss a ");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("mm d,yyyy h:mm:ss a");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("h:mm a");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("h:mm:ss a ");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("h:mm:ss a z");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("MM/d/yy h:mm a");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("MMM d,yyyy h:mm a");
		System.out.println(formatter.format(mydate));
		formatter=new SimpleDateFormat("MMMMMM d,yyyy h:mm:ss a z");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(formatter.format(mydate));
		
		
	}


}



