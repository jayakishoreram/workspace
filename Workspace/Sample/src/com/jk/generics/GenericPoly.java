package com.jk.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericPoly {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		List<Manager> managerList = new ArrayList<>();
		List<President> presidentList = new ArrayList<>();
		int i = 0;
		while(i < 5){
			presidentList.add(new President());
			i++;
		}
		
		i = 0;
		while(i < 5){
			managerList.add(new Manager());
			i++;
		}
		
		i = 0;
		while(i < 5){
			personList.add(new Person());
			i++;
		}
		
		readPresidents(presidentList);
		readPresidents(managerList);
		readPresidents(personList);
		
		addManagers(presidentList);
		addManagers(managerList);
		addManagers(personList);
		
		
		List<? extends Person> persons = new ArrayList<Person>();
		List<? extends Person> managers = new ArrayList<Manager>();
		List<? extends Person> presidents = new ArrayList<President>();
		
		persons.add(null);//we can add only null
		
		List<? super President> personsP = new ArrayList<Person>();
		List<? super President> managersP = new ArrayList<Manager>();
		List<? super President> presidentsP = new ArrayList<President>();
		
		personsP.add(new President());
		managersP.add(new President());
		presidentsP.add(new President());
		
		/*for (Manager person : personsP) {
			
		}*/ //we can read President and subclasses of President
		
		//personsP.add(new Manager()); we can not add super class of President we can add only subclass
		
		List<? extends Person> personsss = getPersons();
		Person prsn = personsss.get(0);
		prsn.m1();
		personsss.add(null); //we can add only null
		President pdnt = (President)personsss.get(0);
		pdnt.m1();pdnt.m2();pdnt.m3();
	}
	
	public static void readPresidents(List<? extends Person> persons){
		for (Person person : persons) {
			if(person instanceof Person)
				System.out.println("Person: "+person);
			if(person instanceof Manager)
				System.out.println("Manager: "+person);
			if(person instanceof President)
				System.out.println("President: "+ person);
			
			
			
		}
		persons.add(null);//we can add only null
		persons.remove(0);
		
	}

	public static void addManagers(List<? super President> presidents){
		
		
		int i = 0;
		while (i < 5) {
			presidents.add(new President());
		}
		
		presidents.add(new President());// we can add Presidents and subclasses of presidents
		
	}
	
	
	public static List<? extends Person> getPersons(){
		
		List<Person> personList = new ArrayList<>();
		personList.add(new President());
		return personList;//Person/Manager/President all are valid
		//return new ArrayList<Manager>();
		//return new ArrayList<President>();
	}
	
	
}

class Person{
	public void m1(){}
}

class Manager extends Person{
	public void m2(){}
}

class President extends Manager{
	public void m3(){}
}
