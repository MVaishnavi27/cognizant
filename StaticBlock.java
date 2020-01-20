class StaticBlock
{
	static int a;
	static
	{
		a=10;
		System.out.println(a);
	}
	static void setA(int a)
	{
		a=5;
		System.out.println("Static method is called"+a);
	}
	public static void main(String ar[])
	{
	System.out.println("Main method calling");
	setA(10);
}}