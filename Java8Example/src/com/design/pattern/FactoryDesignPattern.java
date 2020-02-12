package com.design.pattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		ShapeFactory s1=new ShapeFactory();
		Shape shape1=s1.getShape("circle");
		shape1.draw();
		
		Shape shape2=s1.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3=s1.getShape("Square");
		shape3.draw();

	}

}
