package com;
import java.util.*;
import java.time.LocalTime;
public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date Date=new Date();
System.out.println(Date);
LocalTime time = LocalTime.now();  
System.out.println(time); 
LocalTime time1 = LocalTime.of(10,43,12);  
System.out.println(time1); 
	}

}
