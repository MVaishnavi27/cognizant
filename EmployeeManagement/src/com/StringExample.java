package com;


public class StringExample {
static String s="hello";
static String s1="hello Hi";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(s.charAt(3));
System.out.println(s1.length());
System.out.println(s.compareTo(s1));
System.out.println(s.isEmpty());
System.out.println(s.concat(s1));
System.out.println(s.contains(s));
System.out.println(s.replace('o','i'));
System.out.println(s1.indexOf('l'));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.valueOf('l'));

	}

}
