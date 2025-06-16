package com.builder.design.pattern;

public class Student {
	
	private final int id;
	private final String name;
	
	private final String address;
	
	private Student(studentBuilder builder) {
		this.id = builder.id;
		this.name=builder.name;
		
		this.address=builder.address;
		
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	 static class studentBuilder{
		 private  int id;
			private  String name;
			
			private  String address;
			
			public studentBuilder(int id, String name) {
				this.id=id;
				this.name=name;
			}
			
			public studentBuilder address(String address) {
				this.address=address;
				return this;
			}
		
			public Student build() {
				return new Student(this);
			}

			
		
	}
	 
	 
	 
	 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


	public static void main(String[] args) {
		 
		 Student std = new Student.studentBuilder(1, "nikita").address("pune").build();
		 System.out.println(std);
	 }

}
