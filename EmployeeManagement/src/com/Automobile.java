package com;
class Car
{
	int carNum;
	int run()
	{
		return 60;
	}
}
class FordCar extends Car
{
	int run()
	{
		return super.run()+40;
	}
}



public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FordCar f=new FordCar();
		System.out.println(f.run());

	}

}
