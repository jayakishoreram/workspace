package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestCompare {

	public static void main(String[] args) {
		Employee employee = new Employee("A", 1);
		Employee employee1 = new Employee("B", 2);
		Employee employee2 = new Employee("C", 1);
		Employee employee3= new Employee("D", 2);
		Employee employee4 = new Employee("E", 1);
		Employee employee5 = new Employee("F", 2);
		Employee employee6 = new Employee("G", 1);
		Employee employee7 = new Employee("H", 2);
		Employee employee8 = new Employee("I", 1);
		Employee employee9= new Employee("J", 2);
		
		SortedSet<Employee> employees = new TreeSet<>();
		
		employees.add(employee1);
		employees.add(employee7);
		employees.add(employee8);
		employees.add(employee9);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee);
		Comparator<Employee> comparator = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				
				return e1.getAge().compareTo(e2.getAge());
			}
		};
		
		
		
		System.out.println("EMPLOYEES: "+employees);
	}
}
