package enduser;

import entity.Student;
import collector.lecture;
public class SampleUser {
	public static void main(String[] args) 
	{
		lecture l1=new lecture();
		Student s1=new Student(190031187, "Radhakrishna","male", "Kavali",524021);
		Student s2=new Student(190031177, "Navneet","male", "UP",541023);
		Student s3=new Student(190031249,"Radhakrishna","male", "Agra",542852);
		l1.addStudent(s1);
		l1.addStudent(s2);
		l1.addStudent(s3);
		
		System.out.println(l1);
		l1.sortStudents();
		System.out.println("*****Sorted by Name and Location*****");
		System.out.println(l1);
	}
}