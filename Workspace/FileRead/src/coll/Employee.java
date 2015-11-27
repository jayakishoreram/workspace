package coll;

public class Employee implements Comparable<Employee>{
	
	private String name;
	
	private Integer age;
	
	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	@Override
	public int compareTo(Employee arg0) {
		//return this.getAge().compareTo(arg0.getAge());
		return this.getName().compareTo(arg0.getName()); //&& this.getAge().compareTo(arg0.getAge());
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof Employee))
			return false;
		Employee employee = (Employee)arg0;
		return false;
		//return this.getName().equals(employee.getName()) && this.getAge().equals(employee.getAge());
	}

}
