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
	private String startTime;
	private String endTime;
	//
	private String description;

	private String teacherName;
	private String teacherEmail;
	public CourseVO() {
		super();
		this.id = 0;
		this.name = "";
		this.numClass = 0;
		this.numStudent = 0;
		this.startTime = "";
		this.endTime = "";
		this.description= "";
		this.teacherName = "";
		this.teacherEmail = "";
	}

	public CourseVO(int id, String name, int numClass, int numStudent, String startTime, String endTime) {
		super();
		this.id = id;
		this.name = name;
		this.numClass = numClass;
		this.numStudent = numStudent;
		this.startTime = startTime;
		this.endTime = endTime;
	}

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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	//
	
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
