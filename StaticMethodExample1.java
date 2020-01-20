class StaticMethodExample1
{
	static int num;//static variable
	int c;//nono static variable or instance variable
	/*static void setStatic(int a)//static method
	{
		num=a;
		System.out.println(num);
	}*/
	void setNonStatic(int a)
	{
	num=a;
	System.out.println(num);
	}
	public static void main(String args[])
	{
	StaticMethodExample1 e=new StaticMethodExample1();
	e.setNonStatic(10);
	}
}
