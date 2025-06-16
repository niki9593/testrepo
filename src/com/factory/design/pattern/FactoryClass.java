package com.factory.design.pattern;

public class FactoryClass {

	public Shape getType(String getShapeType) {
		
		if(getShapeType == null) {
			return null;
		}
		
		if(getShapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if(getShapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
		
	}
}
