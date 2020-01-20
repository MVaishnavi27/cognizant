package com;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LambdaExample {
	static int empid;
	static String empname;
	static double empsalary;
	
	public LambdaExample(int empid, String empname, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LambdaExample> list=new ArrayList<LambdaExample>();
		list.add(new LambdaExample(1,"a",3000));
		list.add(new LambdaExample(2,"b",4000));
		list.add(new LambdaExample(3,"c",6000));
		list.add(new LambdaExample(5,"d",3000));
		Stream<LambdaExample> filtered_data=list.stream().filter(e->e.empsalary>4000);
		filtered_data.forEach(
				LambdaExample->System.out.println(LambdaExample.empname+" "+LambdaExample.empsalary));
		
		
		

	}

}
