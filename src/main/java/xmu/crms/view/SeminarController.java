package xmu.crms.view;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.entity.Group;
import xmu.crms.entity.Me;
import xmu.crms.entity.Seminar;
import xmu.crms.entity.Topic;
/**
*
* @author xingbo hu
* @date 2017/12/5
*/
@RestController
public class SeminarController {
	
	List<Seminar> allSeminar=new LinkedList<Seminar>();
	
	public SeminarController() {
		allSeminar.add(new Seminar(1,"讨论课1","需求分析","random",new Date("2017-09-20"),new Date("2017-09-30")));
		allSeminar.add(new Seminar(2,"讨论课2","界面原型","fixed",new Date("2017-10-10"),new Date("2017-10-20")));
		allSeminar.add(new Seminar(3,"讨论课3","概要设计","fixed",new Date("2017-10-30"),new Date("2017-11-10")));
	}
	
	@GetMapping(value = "/seminar/{seminarId}")
	public Seminar getSeminarById(@PathVariable int seminarId) {
		Iterator<Seminar> it = allSeminar.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId) {
				return seminar;
			}
		}
		return null;
	}
    
	@PutMapping(value = "/seminar/{seminarId}")
	public Seminar updateSeminar(@PathVariable int seminarId, Seminar newseminar) {
		Iterator<Seminar> it = allSeminar.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId) {
				allSeminar.remove(seminar);
				allSeminar.add(newseminar);
				return seminar;
			}
		}
		return null;
	}
	
	@DeleteMapping(value = "/seminar/{seminarId}")
	public String deleteSeminar(@PathVariable int seminarId) {
		Iterator<Seminar> it = allSeminar.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId) {
				allSeminar.remove(seminar);
				return "success";
			}
		}
		return "fail";
	}

	@GetMapping(value = "/seminar/{seminarId}/my")
	public List<Seminar> getSeminarsOfStudent(){
		List<Seminar> stuSeminars=new LinkedList<Seminar>();
		stuSeminars.add(new Seminar(3,"讨论课3","概要设计","fixed",new Date("2017-10-30"),new Date("2017-11-10")));
		return stuSeminars;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/detail")
	public Seminar getSeminarDetailById(@PathVariable int seminarId) {
		Iterator<Seminar> it = allSeminar.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId) {
				return seminar;
			}
		}
		return null;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/topic")
	public List<Topic> getSeminarTopic(@PathVariable int seminarId){
		List<Topic> seminarTopics=new LinkedList<Topic>();
		seminarTopics.add(new Topic(1, "A", "web界面原型", "给出web端的界面导航图与界面原型", 6, 5, 6));
		seminarTopics.add(new Topic(2, "B", "小程序界面原型", "给出微信小程序的界面导航图与界面原型", 6, 5, 6));
		return seminarTopics;
	}
	
	@PostMapping(value = "/seminar/{seminarId}/topic")
	public Topic createSeminarTopic(@PathVariable int seminarId){
		Topic topic=new Topic(3, "A", "模块划分", "使用Restful风格进行模块划分", 6, 5, 6);
		return topic;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/group")
	public List<Group> getSeminarGroup(@PathVariable int seminarId){
		List<Group> seminarGroups=new LinkedList<Group>();
		
		return seminarGroups;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/group/my")
	public Group getMySeminarGroup(@PathVariable int seminarId) {
		Group group=new Group(1,1,1);
		return group;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance")
	public List<Me> getAttendance(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendance=new LinkedList<Me>();
		
		return attendance;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/present")
	public List<Me> getAttendancePresent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendancePresent=new LinkedList<Me>();
		
		return attendancePresent;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/late")
	public List<Me> getAttendanceLate(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendanceLate=new LinkedList<Me>();
		
		return attendanceLate;
	}
	
	@GetMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/absent")
	public List<Me> getAttendanceAbsent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendanceAbsent=new LinkedList<Me>();
		
		return attendanceAbsent;
	}
	
	@PutMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/{studentId}")
	public String uploadLocation(@PathVariable int seminarId,@PathVariable int classId,@PathVariable int studentId,Model model) {
		model.addAttribute("report", "reportURL");
		return "success";
	}
}
