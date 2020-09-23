package entity;

public class Student implements Comparable<Student>{
	private int id,postcode;
	private String name,gender,location;
	
	private Student() {
		this.id=0;
		this.name="xxx";
		this.gender="male";
		this.location="xxx";
		this.postcode=0;
	}
	
	public Student(int id,String name,String gender,String location,int postcode) {
		this();
		this.setId(id);
		this.setName(name);
		this.setGender(gender);
		this.setLocation(location);
		this.setPostcode(postcode);
	}
	
	public boolean setId(int id) {
		if(id>0) {
			this.id=id;
			return true;
		}
		return false;
	}
	public boolean setName(String name) {
		if(!name.isEmpty() && name!=null) {
			this.name=name;
			return true;
		}
		return false;
	}
	public boolean setGender(String gender) {
		if(!gender.isEmpty() && gender!=null) {
			this.gender=gender;
			return true;
		}
		return false;
	}
	public boolean setLocation(String location) {
		if(!location.isEmpty() && location!=null) {
			this.location=location;
			return true;
		}
		return false;
	}
	public boolean setPostcode(int postcode) {
		if(postcode>0) {
			this.postcode=postcode;
			return true;
		}
		return false;
	}
	
	public String getId() {
		return Integer.toString(this.id);
	}
	public String getPostcode() {
		return Integer.toString(this.postcode);
	}
	public String getName() {
		return this.name.toUpperCase();
	}
	public String getGender() {
		return this.gender.toUpperCase();
	}
	public String getLocation() {
		return this.location.toUpperCase();
	}
	
	public String toString() {
		String out ="";
		out+=String.format("Id = %s %n", this.getId());
		out+=String.format("Name = %s %n", this.getName());
		out+=String.format("Gender: %s %n", this.getGender());
		out+=String.format("Location: %s %n", this.getLocation());
		out+=String.format("Postcode: %s %n", this.getPostcode());
		return out;
	}
	public int compareTo(Student s) {
		int c=this.getName().compareTo(s.getName());
		if(c==0) {
			c=this.getLocation().compareTo(s.getLocation());
		}
		return c;
	}
}
