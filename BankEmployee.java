class BankEmployee
{
	int EmpId;
	String EmpName;
	int EmpSalary;
	public BankEmployee()
	{
		EmpId=123;//employee phn no.
		EmpName="cse";
		EmpSalary=0;
	}
	public BankEmployee(int ph,String dep,int  no)
	{
		EmpId=ph;
		EmpName=dep;
		EmpSalary=no;
	}
	public void setBankEmployee(int id,String name,int salary)
	{
		EmpId=id;
		EmpName=name;
		EmpSalary=salary;
	}
	public void getBankEmployee()
	{
		//System.out.println("id"+EmpId+"Name"+EmpName+"salary"+EmpSalary);
	}
		int calculateSalary()
		{
		return EmpSalary+500;
		}
}