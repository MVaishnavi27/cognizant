package com;

import java.util.*;

public class EmployeeMain implements Comparator<EmployeeMain>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WageEmployee w=new WageEmployee(1,3000,"abc",new Address(500100,"abc",89),123,45000);
		//System.out.println(w);
		ArrayList<Employee1> al=new ArrayList<Employee1>();
		al.add(new Employee1());
		al.add(new Employee1());
		al.add(new Employee1());
		//al.add(new Student("Tahir"));
		//Collections.sort((List<T>) al);
		for(Employee1 e1:al)
		{
			System.out.println(e1.empname);
		}
		

	}

	@Override
	public int compare(EmployeeMain arg0, EmployeeMain arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
