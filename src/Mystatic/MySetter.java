package Mystatic;

import java.io.*;

class Student {
	private String name;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String N) {
		this.name = N;
	}
	public int getmarks() {
		return marks;
	}

	public void setmarks(int M) {
		this.marks  = M;
	}
}

class MySetter {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Ajith");
		s1.setmarks(99);
		System.out.println(s1.getName());
		System.out.println(s1.getmarks());
	}
}