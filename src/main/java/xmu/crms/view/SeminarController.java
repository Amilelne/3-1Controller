package xmu.crms.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import xmu.crms.view.vo.GroupVO;
import xmu.crms.view.vo.Member;
import xmu.crms.view.vo.RosterVO;
import xmu.crms.view.vo.SeminarVO;
import xmu.crms.view.vo.SiteVO;
import xmu.crms.view.vo.TopicVO;
/**
*
* @author xingbo hu
* @date 2017/12/5
*/
@RestController
public class SeminarController {	
	
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
	public ResponseEntity updateSeminar(@PathVariable int seminarId) {
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	/**
	 * 按ID删除讨论课
	 * @param seminarId
	 * @return
	 */
	@DeleteMapping(value = "/seminar/{seminarId}")
	public ResponseEntity deleteSeminar(@PathVariable int seminarId) {
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
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
	public ResponseEntity<TopicVO> createSeminarTopic(@PathVariable int seminarId){
		TopicVO topic=new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",5,6,2);
		return new ResponseEntity<TopicVO>(topic,HttpStatus.OK);
	}
	
	/**
	 * 按讨论课ID查找小组
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/group")
	public ResponseEntity<List<GroupVO>> getSeminarGroup(@PathVariable int seminarId){
		List<TopicVO> topics=new ArrayList<TopicVO>();
		topics.add(new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",5,6,2));
		List<GroupVO> groups=new ArrayList<GroupVO>();
		List<Member> members=new ArrayList<Member>();
		Member member=new Member(5324,"李四");
		members.add(member);
		member=new Member(5678,"王五");
		members.add(member);
		GroupVO group=new GroupVO(28,"1A1",new Member(8888,"张三"),members,topics);
		groups.add(group);
		group=new GroupVO(29,"1A2",new Member(8888,"张三"),members,topics);
		groups.add(group);
		group=new GroupVO(30,"1B1",new Member(8888,"张三"),members,topics);
		groups.add(group);
		group=new GroupVO(31,"1B2",new Member(8888,"张三"),members,topics);
		groups.add(group);
		return new ResponseEntity<List<GroupVO>>(groups,HttpStatus.OK);
	}
	
	/**
	 * 按讨论课ID查找学生所在小组详情
	 * @param seminarId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/group/my")
	public ResponseEntity<GroupVO> getMySeminarGroup(@PathVariable int seminarId) {
		List<TopicVO> topics=new ArrayList<TopicVO>();
		topics.add(new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",5,6,2));
		List<Member> members=new ArrayList<Member>();
		Member member=new Member(5324,"李四");
		members.add(member);
		member=new Member(5678,"王五");
		members.add(member);
		GroupVO group=new GroupVO(28,"1A1",new Member(8888,"张三"),members,topics);
		return new ResponseEntity<GroupVO>(group,HttpStatus.OK);
	}
	
	/**
	 * 按ID获取讨论课班级签到、分组状态
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance")
	public ResponseEntity<RosterVO> getAttendance(@PathVariable int seminarId,@PathVariable int classId) {
		RosterVO roster=new RosterVO(40,60,"tocall","grouping");
		return new ResponseEntity<RosterVO>(roster,HttpStatus.OK);
	}
	
	/**
	 * 按ID获取讨论课班级已签到名单
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/present")
	public ResponseEntity<List<Member>> getAttendancePresent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Member> present=new ArrayList<Member>();
		present.add(new Member(8888,"张三"));
		present.add(new Member(5324,"李四"));
		present.add(new Member(5678,"王五"));
		return new ResponseEntity<List<Member>>(present,HttpStatus.OK);
	}
	
	/**
	 * 按ID获取讨论课班级迟到签到名单
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/late")
	public ResponseEntity<List<Member>> getAttendanceLate(@PathVariable int seminarId,@PathVariable int classId) {
		List<Member> late=new ArrayList<Member>();
		late.add(new Member(1101,"周一"));
		late.add(new Member(1102,"周二"));
		late.add(new Member(1103,"周三"));
		return new ResponseEntity<List<Member>>(late,HttpStatus.OK);
	}
	
	/**
	 * 按ID获取讨论课班级缺勤名单
	 * @param seminarId
	 * @param classId
	 * @return
	 */
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/absent")
	public ResponseEntity<List<Member>> getAttendanceAbsent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Member> absent=new ArrayList<Member>();
		absent.add(new Member(1104,"赵一"));
		absent.add(new Member(1105,"赵二"));	
		return new ResponseEntity<List<Member>>(absent,HttpStatus.OK);
	}
	
	/**
	 * 签到（上传位置信息）
	 * @param seminarId
	 * @param classId
	 * @param studentId
	 * @return
	 */
	@PutMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/{studentId}")
	public ResponseEntity<String> uploadLocation(@PathVariable int seminarId,@PathVariable int classId,@PathVariable int studentId,@RequestBody SiteVO site) {
		String status="late";
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
}
