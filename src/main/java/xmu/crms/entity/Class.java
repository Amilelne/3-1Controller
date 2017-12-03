package xmu.crms.entity;
/**
 * @author:zimu
 */
public class Class {

	private int id;
	private String name;
	private int numStudent;
	private String site;
	private String courseName;
	private String courseTeacher;
	public Class(int id, String name, int numStudent, String site, String courseName, String courseTeacher) {
		super();
		this.id = id;
		this.name = name;
		this.numStudent = numStudent;
		this.site = site;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
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
	public int getNumStudent() {
		return numStudent;
	}
	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	
}
