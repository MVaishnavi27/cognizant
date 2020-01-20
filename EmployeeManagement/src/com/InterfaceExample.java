package com;
class AirAutomobile implements fly{
	double speed=100;
	String modelName;
	void setmodelName(String modelName)
	{
		this.modelName=modelName;
	}
	String show()
	{
		return modelName;
	}
	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}

interface fly
{
	int Maxspeed=100;
	int fly(int a);
}


public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirAutomobile a=new AirAutomobile();
		a.setmodelName("airbus1520");
		System.out.println("aeroplane is flying with"+a.fly(90));
		System.out.println("max speed is "+fly.Maxspeed);

	}

}
