package com;

public class Shape {
int shapeId;
@Override
public String toString() {
	return "Shape [shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
}

String shapeName;
public Shape(int shapeId, String shapeName) {
	super();
	this.shapeId = shapeId;
	this.shapeName = shapeName;
}


public int getShapeId() {
	return shapeId;
}
public void setShapeId(int shapeId) {
	this.shapeId = shapeId;
}
public String getShapeName() {
	return shapeName;
}
public void setShapeName(String shapeName) {
	this.shapeName = shapeName;
}


public float Area() {
	// TODO Auto-generated method stub
	return 1;
}

}
