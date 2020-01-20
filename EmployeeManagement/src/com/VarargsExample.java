package com;

public class VarargsExample {
	static void add(int...values)
	{
		int sum=0;
		for(int i:values)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(10,20);
add(1,2,3,4,5);
	}

}
