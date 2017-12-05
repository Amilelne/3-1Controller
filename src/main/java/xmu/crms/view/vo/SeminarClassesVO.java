package xmu.crms.view.vo;

import java.util.LinkedList;

import xmu.crms.view.vo.SeminarClassesVO.CourseClass;

public class SeminarClassesVO {
	public String getGroupingMethod() {
		return groupingMethod;
	}

	public void setGroupingMethod(String groupingMethod) {
		this.groupingMethod = groupingMethod;
	}


	private int id;
	private String name;
	private String courseName;
	private String groupingMethod;
	private String startTime;
	private String endTime;
	private LinkedList<CourseClass> classes;
	
	public SeminarClassesVO() {
		super();
		classes = new LinkedList<CourseClass>();
	}
	
	public void addClass(int id, String name) {
		CourseClass tempClass = new CourseClass(id, name);
		this.classes.add(tempClass);
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

	public LinkedList<CourseClass> getClasses() {
		return classes;
	}

	public void setClasses(LinkedList<CourseClass> classes) {
		this.classes = classes;
	}


	public class CourseClass{
		public int id;
		public String name;
		
		public CourseClass() {
			super();
		}
		
		public CourseClass(int id, String name) {
			super();
			this.id = id;
			this.name = name;
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
		
	}
}
