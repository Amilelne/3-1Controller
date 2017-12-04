package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xmu.crms.entity.Group;
import xmu.crms.entity.Me;
import xmu.crms.entity.Seminar;
import xmu.crms.entity.Topic;

@Controller
public class SeminarController {
	
	List<Seminar> Seminars=new LinkedList<Seminar>();
	
	public SeminarController() {
		Seminars.add(new Seminar(1,"讨论课1","需求分析","random",new Date("2017-09-20"),new Date("2017-09-30")));
		Seminars.add(new Seminar(2,"讨论课2","界面原型","fixed",new Date("2017-10-10"),new Date("2017-10-20")));
		Seminars.add(new Seminar(3,"讨论课3","概要设计","fixed",new Date("2017-10-30"),new Date("2017-11-10")));
	}
	
	@RequestMapping(value = "/seminar/{seminarId}",method=GET)
	public Seminar getSeminarById(@PathVariable int seminarId) {
		Iterator<Seminar> it = Seminars.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId)return seminar;
		}
		return null;
	}
    
	@RequestMapping(value = "/seminar/{seminarId}",method=PUT)
	public Seminar updateSeminar(@PathVariable int seminarId, Seminar newseminar) {
		Iterator<Seminar> it = Seminars.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId) {
				Seminars.remove(seminar);
				Seminars.add(newseminar);
				return seminar;
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}",method=DELETE)
	public String deleteSeminar(@PathVariable int seminarId) {
		Iterator<Seminar> it = Seminars.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId) {
				Seminars.remove(seminar);
				return "success";
			}
		}
		return "fail";
	}

	@RequestMapping(value = "/seminar/{seminarId}/my",method=GET)
	public List<Seminar> getSeminarsOfStudent(){
		List<Seminar> stuSeminars=new LinkedList<Seminar>();
		stuSeminars.add(new Seminar(3,"讨论课3","概要设计","fixed",new Date("2017-10-30"),new Date("2017-11-10")));
		return stuSeminars;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/detail",method=GET)
	public Seminar getSeminarDetailById(@PathVariable int seminarId) {
		Iterator<Seminar> it = Seminars.iterator();
		while (it.hasNext()) {
			Seminar seminar=it.next();
			if(seminar.getId()==seminarId)return seminar;
		}
		return null;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/topic",method=GET)
	public List<Topic> getSeminarTopic(@PathVariable int seminarId){
		List<Topic> seminarTopics=new LinkedList<Topic>();
		seminarTopics.add(new Topic(1, "A", "web界面原型", "给出web端的界面导航图与界面原型", 6, 5, 6));
		seminarTopics.add(new Topic(2, "B", "小程序界面原型", "给出微信小程序的界面导航图与界面原型", 6, 5, 6));
		return seminarTopics;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/topic",method=POST)
	public Topic createSeminarTopic(@PathVariable int seminarId){
		Topic topic=new Topic(3, "A", "模块划分", "使用Restful风格进行模块划分", 6, 5, 6);
		return topic;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/group",method=GET)
	public List<Group> getSeminarGroup(@PathVariable int seminarId){
		List<Group> seminarGroups=new LinkedList<Group>();
		
		return seminarGroups;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/group/my",method=GET)
	public Group getMySeminarGroup(@PathVariable int seminarId) {
		Group group=new Group();
		return group;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/class/{classId}/attendance",method=GET)
	public List<Me> getAttendance(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendance=new LinkedList<Me>();
		
		return attendance;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/present",method=GET)
	public List<Me> getAttendancePresent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendancePresent=new LinkedList<Me>();
		
		return attendancePresent;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/late",method=GET)
	public List<Me> getAttendanceLate(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendanceLate=new LinkedList<Me>();
		
		return attendanceLate;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/absent",method=GET)
	public List<Me> getAttendanceAbsent(@PathVariable int seminarId,@PathVariable int classId) {
		List<Me> attendanceAbsent=new LinkedList<Me>();
		
		return attendanceAbsent;
	}
	
	@RequestMapping(value = "/seminar/{seminarId}/class/{classId}/attendance/{studentId}",method=PUT)
	public String uploadLocation(@PathVariable int seminarId,@PathVariable int classId,@PathVariable int studentId,Model model) {
		model.addAttribute("report", "reportURL");
		return "success";
	}
}
