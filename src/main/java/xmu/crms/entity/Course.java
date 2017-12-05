package xmu.crms.entity;

import java.util.Date;
/**
 * @author:zimu
 */
public class Course {
	private int id;
	private String name;
	private int numClass;
	private int numStudent;
	private String startTime;
	private String endTime;
	public Course(int id, String name, int numClass, int numStudent, String startTime, String endTime) {
		super();
		this.id = id;
		this.name = name;
		this.numClass = numClass;
		this.numStudent = numStudent;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumClass() {
		return numClass;
	}
	public void setNumClass(int numClass) {
		this.numClass = numClass;
	}
	public int getNumStudent() {
		return numStudent;
	}
	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}
	
}
