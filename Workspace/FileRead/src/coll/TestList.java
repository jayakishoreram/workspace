package coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<11; i++)
			list.add(i);
		System.out.println("List: "+list);
		
		List<Integer> subList = list.subList(0, 5);
		System.out.println("Sub List: "+subList);
		for(int i=1; i<5;i++)
			subList.add(i*10);
		//subList.clear();
		System.out.println("Sub List: "+subList);
		System.out.println("List: "+list);
		
		List<Integer> anotherList = new ArrayList<>(subList);
		for(int i=1; i<5;i++)
			anotherList.add(i*10);
		//subList.clear();
		System.out.println("Sub List: "+anotherList);
		System.out.println("List: "+list);
	}
}
