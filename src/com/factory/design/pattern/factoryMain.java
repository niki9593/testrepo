package com.factory.design.pattern;

public class factoryMain {

	public static void main(String[] args) {
		
		FactoryClass fc = new FactoryClass();
		
		Shape shape1 = fc.getType("CIRCLE");
		shape1.draw();
		Shape shape2 = fc.getType("SQUARE");
		shape2.draw();
		
	}

}
