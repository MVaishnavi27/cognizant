package com;
class Engine
{
	int engineNo,age;
	String fuelType;
	public Engine(int engineNo, int age, String fuelType) {
		super();
		this.engineNo = engineNo;
		this.age = age;
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", age=" + age + ", fuelType=" + fuelType + "]";
	}
	
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
class Car1
{
	Engine e;
	int carnumber;
	String carmode;
	public Car1(Engine e, int carnumber, String carmode) {
		super();
		this.e = e;
		this.carnumber = carnumber;
		this.carmode = carmode;
	}

	@Override
	public String toString() {
		return "Car1 [e=" + e + ", carnumber=" + carnumber + ", carmode=" + carmode + "]";
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public String getCarmode() {
		return carmode;
	}
	public void setCarmode(String carmode) {
		this.carmode = carmode;
	}
	
}
public class HasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1(new Engine(10,20,"petrol"),3867,"suzuki");
		System.out.println(c);

	}

}
