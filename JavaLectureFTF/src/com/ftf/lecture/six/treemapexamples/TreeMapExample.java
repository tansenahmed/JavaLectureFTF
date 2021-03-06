package com.ftf.lecture.six.treemapexamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Person, String> phoneBook = new TreeMap<>();
		
		Person rafi = new Person("Rafi");
		Person rahman = new Person("Rahman");
		Person rahim1 = new Person("Rahim");
		Person rahim2 = new Person("Rahim"); 
		
		phoneBook.put(rafi, "(919)578-3409");
		phoneBook.put(rahman, "(689)296-1582");
		phoneBook.put(rahim1, "(720)142-0580");
		phoneBook.put(rahim2, "(212)205-5399");
		
		for(Map.Entry<Person, String> entry : phoneBook.entrySet()) {
			System.out.println(entry.getKey().toString() + "\t-\t " + entry.getValue()); 
		}
	}

}
