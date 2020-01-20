package com;

public class Box {
int length,width,height;


	public Box(int length, int width, int height) {
	super();
	this.length = length;
	this.width = width;
	this.height = height;
}


	public int getLength() {
	return length;
}

	

public void setLength(int length) {
	this.length = length;
}


public int getWidth() {
	return width;
}


public void setWidth(int width) {
	this.width = width;
}


public int getHeight() {
	return height;
}


public void setHeight(int height) {
	this.height = height;
}
public  int calculateVolume()
{
	return length*width*height;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,10,10);
System.out.println(b.calculateVolume());
	}

}
