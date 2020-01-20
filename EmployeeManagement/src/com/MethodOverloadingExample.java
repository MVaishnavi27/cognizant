package com;


	class Addition
	{
		int add(int a,int b)
		{
			return a+b;
		}
		double add(double a,int b)
		{
			return a+b;
		}
		double add(double a,double b)
		{
			return a+b;
		}
		
	}
	public class MethodOverloadingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition c=new Addition();
		System.out.println(c.add(5,5));
		System.out.println(c.add(40.43,90));
		System.out.println(c.add(4.9,3.6));
	

	}

}
