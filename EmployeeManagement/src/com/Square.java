package com;

public class Square extends Shape {
	int side;

	public Square(int shapeId, String shapeName, int side) {
		super(shapeId, shapeName);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", shapeId=" + shapeId + ", shapeName=" + shapeName + ", toString()="
				+ super.toString() + ", getShapeId()=" + getShapeId() + ", getShapeName()=" + getShapeName()
				+ ", Area()=" + Area() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	public float Area()
	{
		return super.Area()*side*side;
	}



}
