package com;

public class Rectangle extends Shape{
	int length,breadth;
	

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", toString()=" + super.toString()
				+ ", getShapeId()=" + getShapeId() + ", getShapeName()=" + getShapeName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public Rectangle(int shapeId,String shapeName,int length, int breadth) {
		super(shapeId,shapeName);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public float Area()
	{
		return length*breadth;
	}
}
	
