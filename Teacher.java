package CollegeManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int Tid;
	private String Tname;
	private String Tlocation;
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTlocation() {
		return Tlocation;
	}
	public void setTlocation(String tlocation) {
		Tlocation = tlocation;
	}
	public Teacher(int tid, String tname, String tlocation) {
		super();
		Tid = tid;
		Tname = tname;
		Tlocation = tlocation;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [Tid=" + Tid + ", Tname=" + Tname + ", Tlocation=" + Tlocation + "]";
	}
	

}
