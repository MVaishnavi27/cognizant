package com;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(1,"pqr",3,4);
		System.out.println(r.Area());
		Circle c1=new Circle(1,"abc",4);
		System.out.println("area="+c1.Area());
		Square s=new Square(2,"square",2);
		System.out.println(s.Area());

	}

}
