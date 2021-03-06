package collector;

import java.util.*;
import entity.Student;
public class lecture {
	private ArrayList<Student> lec;
	
	public lecture() {
		lec=new ArrayList<Student>();
	}
	
	public boolean addStudent(Student s) {
		if(s!=null) {
			lec.add(s);
			return true;
		}
		return false;
	}
	
	public String toString() {
		String out="";
		for(Student s:lec) {
			out+=s.toString();
		}
		return out;
	}
	
	public void sortStudents() {
	   	Collections.sort(lec);
	}
}
