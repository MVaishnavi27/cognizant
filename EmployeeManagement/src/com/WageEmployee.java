package com;

public class WageEmployee extends Employee1 {

	int numbers;
	//public String toString() {
	//	return "WageEmployee [numbers=" + numbers + ", wages=" + wages + ", empid=" + empid + ", salary=" + salary
			//	+ ", empname=" + empname + ", address=" + address + "]";
	//}





	int wages;
	public int getNumbers() {
		return numbers;
	}




	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}




	public int getWages() {
		return wages;
	}




	public void setWages(int wages) {
		this.wages = wages;
	}



	
	public WageEmployee(int empid, int salary, String empname,Address address, int numbers, int wages) {
	//	super(empid, salary, empname,address);
		this.numbers = numbers;
		this.wages = wages;
	}



	
	
	public int calculateWages() 
	{
		
		return getSalary()*wages;
	}

}
