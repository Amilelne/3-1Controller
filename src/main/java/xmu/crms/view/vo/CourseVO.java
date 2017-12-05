package xmu.crms.view.vo;
import java.util.Date;
/**
 * @author:zimu
 */
public class CourseVO {
	private int id;
	private String name;
	private int numClass;
	private int numStudent;
	private Date startTime;
	private Date endTime;
	//
	private String description;
	//private Proportion proportion;

	private String teacherName;
	private String teacherEmail;


	public CourseVO(int id, String name, int numClass, int numStudent, Date startTime, Date endTime) {
		super();
		this.id = id;
		this.name = name;
		this.numClass = numClass;
		this.numStudent = numStudent;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	/*public CourseVO(String name, String description, Date startTime, Date endTime, int report,int presentation, int c, int b, int a ) {
		super();
		this.name = name;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.proportion = new Proportion(report, presentation, c, b, a);
	}*/

	public CourseVO(int id, String name, String description, String teacherName, String teacherEmail) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
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
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	/*
	public class Proportion {
		public int report;
		public int presentation;
		public int c;
		public int b;
		public int a;
		public Proportion(int report,int presentation, int c, int b, int a) {
			super();
			this.report = report;
			this.presentation = presentation;
			this.c = c;
			this.b = b;
			this.a = a;
		}
	}
	
	public Proportion getProportion() {
		return proportion;
	}

	public void setProportion(Proportion proportion) {
		this.proportion = proportion;
	}
	*/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
}

