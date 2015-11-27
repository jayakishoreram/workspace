package coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestArray {

	public static void main(String[] args) {
		
		List<String> sList = Arrays.asList("AA","BB","CC");
		sList.add("DD");
		System.out.println(sList);
		
		List<String> stringList = new ArrayList<>(Collections.nCopies(10, "AAA"));
		
		stringList.removeAll(Collections.singleton("AAA"));
	}
}
