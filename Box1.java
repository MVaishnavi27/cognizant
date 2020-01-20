class Box1
{
	
	float length,breadth,height,volume;
	Box1()
	{
	length=2;
	breadth=3;
	height=2;
	System.out.println("Volume"+(l*b*h));
	}
	Box1(float length1,float breadth1,float height1)
	{
		length=length1;
		breadth=breadth1;
		h=height1;
		System.out.println("Volume"+(l*b*h));
	}
	void setBox1(float bl,float bb,float bh)
	{
		length=blength;
		breadth=bbreadth;
		height=bheight;
	}
	void getBox1()
	{
		System.out.println("len"+length+"Breadth"+breadth+"Height"+height);
		System.out.println("volume"+(l*b*h));
	}
public static void main(String args[])
{
Box1 b=new Box1();
b.setBox1(1,2,3);
b.getBox1();
}
	
	
}