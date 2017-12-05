package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import xmu.crms.view.vo.ClassVO;
import xmu.crms.view.vo.CourseVO;
import xmu.crms.view.vo.SeminarVO;

@Controller
public class CourseController {

	//获取与当前用户相关联的课程列表
	@GetMapping("/course")
	public ResponseEntity<List<CourseVO>> getCourseList() {
		LinkedList<CourseVO> list = new LinkedList<CourseVO>();
		list.add(new CourseVO(1, "OOAD", 3, 60, "2017-9-1", "2018-1-1"));
		list.add(new CourseVO(2, "J2EE", 1, 60, "2017-9-1", "2018-1-1")) ;
		return new ResponseEntity<List<CourseVO>>(list,HttpStatus.OK);
	}
	
	//创建课程
	@PostMapping("/course")
	public ResponseEntity<Integer> createCourse() {
			
		return new ResponseEntity<Integer>(23, HttpStatus.OK);
	}
	
	//按ID获取课程
	@GetMapping("/course/{courseId}")
	public ResponseEntity<CourseVO> getCourseById(@PathVariable("courseId") int courseId) {
		CourseVO course = new CourseVO(23, "OOAD", "面向对象分析与设计", "邱明", "mingqiu@xmu.edu.cn");
		return new ResponseEntity<CourseVO>(course, HttpStatus.OK);
	}
	
	//修改课程
	@PutMapping("/course/{courseId}")
	public ResponseEntity updateCourse(@PathVariable("courseId") int courseId) {
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	//按ID删除课程
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity deleteCourseById(@PathVariable("courseId") int courseId) {
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	//按ID获取课程的班级列表
	@GetMapping("/course/{courseId}/class")
	public ResponseEntity<List<ClassVO>> getClassListById(@PathVariable int courseId) {
		LinkedList list = new LinkedList<ClassVO>();
		ClassVO tempClass = new ClassVO();
		tempClass.setId(45);
		tempClass.setName("周三1-2节");
		list.add(tempClass);
		
		tempClass = new ClassVO();
		tempClass.setId(48);
		tempClass.setName("周三3-4节");
		list.add(tempClass);
		return new ResponseEntity<List<ClassVO>>(list, HttpStatus.OK);
	}
	
	//在指定ID的课程创建班级
	@PostMapping("/course/{courseId}/class")
	public ResponseEntity<Integer> createClassById(@PathVariable("courseId") int courseId) {

		return new ResponseEntity<Integer>(45, HttpStatus.OK);
	}
	
	//按课程ID获取讨论课详情列表
	@GetMapping("/course/{courseId}/seminar")
	public ResponseEntity<List<SeminarVO>> getSeminarListById(@PathVariable("courseId") int courseId, boolean embedGrade) {
		/*if(embedGrade==false){} else{}*/
		LinkedList list = new LinkedList<SeminarVO>();
		SeminarVO tempSeminar = new SeminarVO();
		tempSeminar.setId(29);
		tempSeminar.setName("界面原型设计");
		tempSeminar.setDescription("界面原型设计");
		tempSeminar.setGroupingMethod("fixed");
		tempSeminar.setStartTime("2017-09-25");
		tempSeminar.setEndTime("2017-10-09");
		tempSeminar.setGrade(4);
		list.add(tempSeminar);
		
		tempSeminar = new SeminarVO();
		tempSeminar.setId(32);
		tempSeminar.setName("概要设计");
		tempSeminar.setDescription("模型层与数据库设计");
		tempSeminar.setGroupingMethod("fixed");
		tempSeminar.setStartTime("2017-10-10");
		tempSeminar.setEndTime("2017-10-24");
		tempSeminar.setGrade(5);
		list.add(tempSeminar);
		return new ResponseEntity<List<SeminarVO>>(list, HttpStatus.OK);
	}
	
	//在指定ID的课程创建讨论课
	@PostMapping("/course/{courseId}/seminar")
	public ResponseEntity<Integer> createSeminarById(@PathVariable("courseId") int courseId){

		return new ResponseEntity<Integer>(32, HttpStatus.OK);
	}
	
	//获取课程正在进行的讨论课
	@GetMapping("/course/{courseId}/seminar/current")
	public ResponseEntity<SeminarVO> getSeminar(@PathVariable("courseId") int courseId) {
		SeminarVO tempSeminar = new SeminarVO();
		tempSeminar.setId(29);
		tempSeminar.setName("界面原型设计");
		tempSeminar.setCourseName("OOAD");	//?
		tempSeminar.setGroupingMethod("fixed");
		tempSeminar.setStartTime("2017-09-25");
		tempSeminar.setEndTime("2017-10-09");
		
		LinkedList classes = new LinkedList<ClassVO>();
		ClassVO tempClass = new ClassVO();
		tempClass.setId(53);
		tempClass.setName("周三12");
		classes.add(tempClass);
		
		tempClass = new ClassVO();
		tempClass.setId(57);
		tempClass.setName("周三34");
		classes.add(tempClass);
		
		tempSeminar.setClasses(classes);
		return new ResponseEntity<SeminarVO>(tempSeminar, HttpStatus.OK);
	}
	
	//按课程ID获取学生的所有讨论课成绩
	@GetMapping("/course/{courseId}/grade")
	public ResponseEntity<List<Grade>> getSeminarGradeById(@PathVariable("courseId") int courseId) {
		LinkedList list = new LinkedList<Grade>();
		list.add(new Grade("需求分析", "3A2", "张三", 3, 4, 4));
		list.add(new Grade("界面原型设计", "3A3", "张三", 4, 4, 4));
		return new ResponseEntity<List<Grade>>(list, HttpStatus.OK);
	}
	
	class Grade{
		private String seminarName;
		private String groupName;
		private String leaderName;
		private int presentationGrade;
		private int reportGrade;
		private int grade;
		
		public Grade(String seminarName, String groupName, String leaderName, int presentationGrade, int reportGrade,
				int grade) {
			super();
			this.seminarName = seminarName;
			this.groupName = groupName;
			this.leaderName = leaderName;
			this.presentationGrade = presentationGrade;
			this.reportGrade = reportGrade;
			this.grade = grade;
		}

		public String getSeminarName() {
			return seminarName;
		}

		public void setSeminarName(String seminarName) {
			this.seminarName = seminarName;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getLeaderName() {
			return leaderName;
		}

		public void setLeaderName(String leaderName) {
			this.leaderName = leaderName;
		}

		public int getPresentationGrade() {
			return presentationGrade;
		}

		public void setPresentationGrade(int presentationGrade) {
			this.presentationGrade = presentationGrade;
		}

		public int getReportGrade() {
			return reportGrade;
		}

		public void setReportGrade(int reportGrade) {
			this.reportGrade = reportGrade;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}
	}
}
