package com.singleton.design.pattern;

import java.io.Serializable;

public class Singleton implements Serializable , Cloneable{

	private static  Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					return new Singleton();
				}
				
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return getInstance();
		
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		 throw new CloneNotSupportedException("Cloning not supported for Singleton");
		
	}
	
}
