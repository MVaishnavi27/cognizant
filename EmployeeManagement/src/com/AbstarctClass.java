package com;
abstract class AbstractExample
{
	abstract void add(int a,int b);
	void show()
	{
		System.out.println("This is an abstract class");
	}
}
class AbstractImpl extends AbstractExample
{
@Override
void add(int a, int b) {
	// TODO Auto-generated method stub
	System.out.println(a+b);
	
}
}
public class AbstarctClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractImpl a=new AbstractImpl();
a.add(3, 3);
	}

}

