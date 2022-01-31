package Mystatic;

class employee {
	String name;
	int salary;
	String dept;

	employee(String name, int salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
}

public class MyConstructor {
	public static void main(String args[]) {
		employee e1 = new employee("Ajith", 25000, "Java");
		employee e2 = new employee("Ajith", 25000, "Java");
		System.out.println("Name = " + e1.name + " \nSalary = " + e1.salary + " \nDept = " + e1.dept);
		System.out.println("Name = " + e2.name + " \nSalary = " + e2.salary + " \nDept = " + e2.dept);
	}
	
	

}
