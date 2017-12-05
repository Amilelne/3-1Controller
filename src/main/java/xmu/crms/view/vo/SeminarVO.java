package xmu.crms.view.vo;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author xingb
* @date 2017/12/5
*/
public class SeminarVO {
	private int id;
	private String name;
	private String description;
	private String groupingMethod;
	private String startTime;
	private String endTime;
	private List<TopicVO> topics=new ArrayList<TopicVO>();
	/**微信小程序不需要proportions**/
	
	/**my**/
	private String courseName;
	private int classCalling;
	private boolean isLeader;
	private boolean areTopicsSelected;
	
	/**detail**/
	private String site;
	private String teacherName;
	private String teacherEmail;
	
	public SeminarVO() {
		super();
	}
	public SeminarVO(int id, String name, String description, String groupingMethod, String startTime, String endTime) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.groupingMethod = groupingMethod;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGroupingMethod() {
		return groupingMethod;
	}
	public void setGroupingMethod(String groupingMethod) {
		this.groupingMethod = groupingMethod;
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
	public List<TopicVO> getTopics() {
		return topics;
	}
	public void setTopics(List<TopicVO> topics) {
		this.topics = topics;
	}
	public void addTopic(TopicVO topic) {
		topics.add(topic);
	}
	public int getClassCalling() {
		return classCalling;
	}
	public void setClassCalling(int classCalling) {
		this.classCalling = classCalling;
	}
	public boolean isLeader() {
		return isLeader;
	}
	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}
	public boolean isAreTopicsSelected() {
		return areTopicsSelected;
	}
	public void setAreTopicsSelected(boolean areTopicsSelected) {
		this.areTopicsSelected = areTopicsSelected;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
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
