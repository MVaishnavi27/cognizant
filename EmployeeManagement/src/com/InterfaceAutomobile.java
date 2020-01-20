package com;

abstract class Automobile1 {
	String modelName;

	void setmodelName(String modelName) {
		this.modelName = modelName;
	}

	String show() {
		return modelName;
	}

}

class Automobile2 extends Automobile1 implements airAuto ,trainAuto,shipAuto{

	@Override
	public int airAuto(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int trainAuto(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int shipAuto(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}

interface airAuto {
	int MaxSpeed = 100;

	int airAuto(int a);
}
interface trainAuto {
	int MaxSpeed1 = 100;

	int trainAuto(int a);
}
interface shipAuto {
	int MaxSpeed2 = 100;

	int shipAuto(int a);
}

public class InterfaceAutomobile {

	public static void main(String[] args) {
		Automobile2 b = new Automobile2();
		// TODO Auto-generated method stub
		// Automobile1 a=new Automobile1();
		b.setmodelName("airbus1520");
		b.setmodelName("train890");
		System.out.println("aeroplane is flying with" + b.airAuto(90));
		System.out.println("max speed is " + airAuto.MaxSpeed);
		System.out.println(b.modelName+"train is running with" + b.trainAuto(90));
		System.out.println("max speed is " + trainAuto.MaxSpeed1);
		System.out.println("ship is sailing with" + b.shipAuto(90));
		System.out.println("max speed is " + shipAuto.MaxSpeed2);
	

	}

}
