/*class A1
{
	A1()
	{
	System.out.println("A1()");
	}
	A1(int a)
	{
	this();
	System.out.println(a);
	}
	A1(int a,int b)
	{
	this(a);
	System.out.println(b);
}
public static void main(String ar[])
{
A1 a=new A1(2,7);
}
}*/

class A1
{
static int count=0;
A1()
{
count++;
}
public static void main(String ar[])
{
A1 a=new A1();
System.out.println(count); 
}
}