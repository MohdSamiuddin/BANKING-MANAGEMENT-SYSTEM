package CollegeManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
private int eid;
private String ename;
private String location;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Course(int eid, String ename, String location) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.location = location;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", location=" + location + "]";
}


}
