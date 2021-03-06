package entity;

import entity.Ltps;
public class Course implements Comparable<Course> {
	private String title,code;
	private Ltps ltps;
	public Course(String title,String code,int l,int t,int p,int s) {
		this.setTitle(title);
		this.setCode(code);
		ltps=new Ltps(l,t,p,s);
	}
	public boolean setTitle(String title) {
		if(!title.isEmpty()&&title!=null) {
			this.title=title;
			return true;
		}
		return false;
	}
	public boolean setCode(String code) {
		if(!code.isEmpty()&&code!=null) {
			this.code=code;
			return true;
		}
		return false;
	}
	public String getTitle() {
		return this.title.toUpperCase();
	}
	public String getCode() {
		return this.code.toUpperCase();
	}
	
	public int compareTo(Course cou) {
		int c=0;
		c=this.getTitle().compareTo(cou.getTitle());
		if(c==0) {
			c=this.ltps.compareTo(cou.ltps);
		}
		return c;
	}
	public String toString() {
		String out="";
		out+=String.format("Title: %s%n", this.getTitle());
		out+=String.format("Code: %s%n", this.getCode());
		out+=String.format("LTPS: %s%n", this.ltps.toString());
		return out;
	}
}
