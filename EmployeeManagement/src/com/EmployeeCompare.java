package com;
import java.util.*;

class Employee4 extends EmployeeCompare implements Comparable<Employee1>
{
public String Empname;
public int Empid;
public Employee4(String empname, int empid) {
super();
this.Empname = empname;
this.Empid = empid;
}
public int compareTo(Employee4 person)
{
return this.Empid-person.Empid;
}
@Override
public int compareTo(Employee1 arg0) {
	// TODO Auto-generated method stub
	return 0;
}

}
class Employee2 extends EmployeeCompare implements Comparator<Employee2>
{
public String Empname;
public Employee2(String empname, int empid) {
super();
Empname = empname;
Empid = empid;
}



public int Empid;
public String getEmpname() {
return Empname;
}

public void setEmpname(String empname) {
Empname = empname;
}

public int getEmpid() {
return Empid;
}

public void setEmpid(int empid) {
Empid = empid;
}



@Override
public int compare(Employee2 empname, Employee2 empid) {
// TODO Auto-generated method stub
Employee2 e1=(Employee2) empname;
Employee2 e2=(Employee2) empid;
return e1.Empname.compareTo(e2.Empname);
}

}
public class EmployeeCompare{

public static void main(String[] args) {
// TODO Auto-generated method stub
/*ArrayList<Employee4> al=new ArrayList<Employee4>();
al.add(new Employee4("viru",10));
al.add(new Employee4("saurav",4));
al.add(new Employee4("mukesh",8));
al.add(new Employee4("tahir",1));
Collections.sort(al,new Employee4(null,0));
for(Employee4 s:al)
{
System.out.println(s.Empname);
}*/
ArrayList<Employee2> al1=new ArrayList ();
al1.add(new Employee2("ss",123));
al1.add(new Employee2("cc",1345));
al1.add(new Employee2("dd",12));
al1.add(new Employee2("ee",567));
Collections.sort(al1,new Employee2(null,0));
Iterator itr=al1.iterator();
while(itr.hasNext())
{
Employee2 e2=(Employee2) itr.next();
System.out.println(e2.Empname+""+e2.Empid);
}

}
}


