package com.ashish.practice.factorydesign;

public class FactoryPatternRunner {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Rectangle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Square");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Circle");
		shape3.draw();
		
	}

}
