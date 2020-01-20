  package com;
  import java.util.*;

 class Employee1 implements Comparator<Employee1>{

	public int empid,salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String empname;  
	 //Address address;

	
	/*public Employee1(int empid, int salary, String empname,Address address2) {
		super();
		this.empid = empid; 
		this.salary = salary;
		this.empname = empname;
		//this.address=empaddress;
	}*/
	public int compareTo(Employee1 e)
	{
		return empname.compareTo(e.empname);
	}
	public int getEmpid() {
		return empid;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e=new Employee(1,60000,"abc");
		//System.out.println("id"+empid+"name"+empname+"salary"+salary);

	}
	@Override
	public int compare(Employee1 arg0, Employee1 arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
