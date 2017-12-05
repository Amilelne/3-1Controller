package xmu.crms.view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import xmu.crms.entity.Group;
import xmu.crms.entity.Me;
import xmu.crms.view.vo.GroupVO;
import xmu.crms.view.vo.SeminarVO;
import xmu.crms.view.vo.TopicVO;
/**
*
* @author xingbo hu
* @date 2017/12/5
*/
@RestController
public class SeminarController {	

	/**
	 * test
	 * @return
	 */
	@GetMapping(value = "/seminar")
	public ResponseEntity<String> getSeminar() {
		return new ResponseEntity<String>("success",HttpStatus.OK);

	}
	
	/**
	 * 按ID获取讨论课
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}")
	public ResponseEntity<SeminarVO> getSeminarById(@PathVariable int seminarId) {
		SeminarVO seminar=new SeminarVO(32,"概要设计","模型层与数据库设计","fixed","2017-10-10","2017-10-24");
		TopicVO topic1=new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",5,6,2);
		seminar.addTopic(topic1);
		TopicVO topic2=new TopicVO(258,"B","数据库设计","类图与ER图",5,6,2);
		seminar.addTopic(topic2);
		return new ResponseEntity<SeminarVO>(seminar,HttpStatus.OK);
	}
    
	/**
	 * 按ID修改讨论课
	 * @param seminarId
	 * @return
	 */
	@PutMapping(value = "/seminar/{seminarId}")
	public ResponseEntity updateSeminar(@PathVariable int seminarId, @RequestBody SeminarVO seminarRes) {

		return new ResponseEntity(HttpStatus.OK);
	}
	
	/**
	 * 按ID删除讨论课
	 * @param seminarId
	 * @return
	 */
	@DeleteMapping(value = "/seminar/{seminarId}")
	public ResponseEntity deleteSeminar(@PathVariable int seminarId) {
		
		return new ResponseEntity(HttpStatus.OK);
	}

	/**
	 * 按ID获取与学生有关的讨论课信息
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/my")
	public ResponseEntity<SeminarVO> getSeminarsOfStudent(@PathVariable int seminarId){
		SeminarVO seminar=new SeminarVO(32,"概要设计","模型层与数据库设计","fixed","2017-10-10","2017-10-24");
		seminar.setCourseName("OOAD");
		seminar.setClassCalling(23);
		seminar.setLeader(true);
		seminar.setAreTopicsSelected(true);
		return new ResponseEntity<SeminarVO>(seminar,HttpStatus.OK);
	}
	
	/**
	 * 按ID获取讨论课详情
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/detail")
	public ResponseEntity<SeminarVO> getSeminarDetailById(@PathVariable int seminarId) {
		SeminarVO seminar=new SeminarVO(32,"概要设计","模型层与数据库设计","fixed","2017-10-10","2017-10-24");
		seminar.setSite("海韵201");
		seminar.setTeacherName("邱明");
		seminar.setTeacherEmail("mingqiu@xmu.edu.cn");
		return new ResponseEntity<SeminarVO>(seminar,HttpStatus.OK);
	}
	
	/**
	 * 按ID获取讨论课的话题
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/topic")
	public ResponseEntity<List<TopicVO>> getSeminarTopic(@PathVariable int seminarId){
		SeminarVO seminar=new SeminarVO(32,"概要设计","模型层与数据库设计","fixed","2017-10-10","2017-10-24");
		TopicVO topic1=new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",5,6,2);
		seminar.addTopic(topic1);
		TopicVO topic2=new TopicVO(258,"B","数据库设计","类图与ER图",5,6,2);
		seminar.addTopic(topic2);
		List<TopicVO> topics=seminar.getTopics();
		return new ResponseEntity<List<TopicVO>>(topics,HttpStatus.OK);
	}
	
	/**
	 * 在指定ID的讨论课创建话题
	 * @param seminarId
	 * @return
	 */
	@PostMapping(value = "/seminar/{seminarId}/topic")
	public ResponseEntity createSeminarTopic(@PathVariable int seminarId,@RequestBody TopicVO topic){
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	/**
	 * 按讨论课ID查找小组
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/group")
	public ResponseEntity<List<GroupVO>> getSeminarGroup(@PathVariable int seminarId){
		List<GroupVO> groups=new ArrayList<GroupVO>();
		GroupVO group=new GroupVO();
		return new ResponseEntity<List<GroupVO>>(groups,HttpStatus.OK);
	}
	
	/**
	 * 按讨论课ID查找学生所在小组详情
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/group/my")
	public Group getMySeminarGroup(@PathVariable int seminarId) {
		Group group=new Group(1,1,1);
		return group;
	}
	
	/**
	 * 按ID获取讨论课班级签到、分组状态
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance")
	public List<Me> getAttendance(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendance=new LinkedList<Me>();
		
		return attendance;
	}
	
	/**
	 * 按ID获取讨论课班级已签到名单
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/present")
	public List<Me> getAttendancePresent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendancePresent=new LinkedList<Me>();
		
		return attendancePresent;
	}
	
	/**
	 * 按ID获取讨论课班级迟到签到名单
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/late")
	public List<Me> getAttendanceLate(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendanceLate=new LinkedList<Me>();
		
		return attendanceLate;
	}
	
	/**
	 * 按ID获取讨论课班级缺勤名单
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/absent")
	public List<Me> getAttendanceAbsent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendanceAbsent=new LinkedList<Me>();
		
		return attendanceAbsent;
	}
	
	/**
	 * 按小组ID获取小组详情
	 * @param seminarId
	 * @param classId
	 * @param studentId
	 * @return
	 */
	@PutMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/{studentId}")
	public String uploadLocation(@PathVariable int seminarId,@PathVariable int classId,@PathVariable int studentId,Model model) {
		model.addAttribute("report", "reportURL");
		return "success";
	}
}
