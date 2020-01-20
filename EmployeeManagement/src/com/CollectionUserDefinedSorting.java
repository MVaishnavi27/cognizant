package com;

import java.util.*;

class Student implements Comparable<Student>
{
	public String name;
	public Student(String name)
	{
		this.name=name;
	}
	public int compareTo(Student person){
		//System.out.println(name.compareTo(person.name));
		return  name.compareTo(person.name);
		
	}
}


public class CollectionUserDefinedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("viru"));
		al.add(new Student("saurav"));
		al.add(new Student("mukesh"));
		al.add(new Student("Tahir"));
		Collections.sort(al);
		for(Student s :al)
		{
			System.out.println(s.name);
		}
	}

}
