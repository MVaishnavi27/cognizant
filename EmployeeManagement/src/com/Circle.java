package com;

public class Circle extends Shape
{
	int radius;
	final float c=3.14f;

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeId=" + shapeId + ", shapeName=" + shapeName + ", toString()="
				+ super.toString() + ", getShapeId()=" + getShapeId() + ", getShapeName()=" + getShapeName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public Circle(int shapeId, String shapeName, int radius) {
		super(shapeId, shapeName);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float Area()
	{
		
		return super.Area()*c*radius*radius;
	}
}

