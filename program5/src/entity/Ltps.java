package entity;

public class Ltps implements Comparable<Ltps> {
	private int l,t,p,s;
	private Ltps() {
		this.l=0;
		this.t=0;
		this.p=0;
		this.s=0;
	}
	public Ltps(int l,int t,int p,int s) {
		this();
		this.l=l;
		this.t=t;
		this.p=p;
		this.s=s;
	}
	public double getCredits() {
		return l+t+(p/2)+(s/4);
	}
	public double getContactHours() {
		return l+t+p+s;
	}
	public int compareTo(Ltps ltps) {
		if(this.getCredits()>ltps.getCredits()) return 1;
		else if(this.getCredits()<ltps.getCredits()) return -1;
		return 0;
	}
	public String toString() {
		String out="";
		out+=String.format("Credits = %f%n", this.getCredits());
		out+=String.format("Contact Hours = %f%n",this.getContactHours());
		return out;
	}
}
