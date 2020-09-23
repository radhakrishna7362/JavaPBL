package collection;

import java.util.*;
import entity.Course;
public class Program {
	private static ArrayList<Course> p=new ArrayList<Course>();
	public static void main(String args[]) {
		
		Course c1=new Course("Data Structures","18CS1001",3,0,2,4);
		Course c2=new Course("C Programming","18CS1002",3,0,2,6);
		Course c3=new Course("Data Structures","18CS1003",3,0,2,2);
		Course c4=new Course("Design Thinking","18CS1004",1,0,0,4);
		
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(c4);
		printArrayList();
		Collections.sort(p);
		System.out.println("*****Sorted by Title and Credits*****");
		printArrayList();
	}
	private static void printArrayList() {
		for(Course c:p) {
			System.out.println(c);
		}
	}
}
