package xmu.crms.view;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import xmu.crms.view.vo.TopicVO;
import xmu.crms.view.vo.SchoolVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class TopicController {
	
	@GetMapping("/topic/{topicId}")
	public ResponseEntity<TopicVO> getTopic(@PathVariable int topicId)
	{
		return new ResponseEntity<TopicVO>(new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",5,6,2),HttpStatus.OK);
	}
	
	@PutMapping("/topic/{topicId}")
	public ResponseEntity reviseTopic(@PathVariable int topicId,@RequestBody reviseTopicInfo reviseInfo)
	{
		return new ResponseEntity(HttpStatus.OK);
	}

	@DeleteMapping("/topic/{topicId}")
	public ResponseEntity deleteTopic(@PathVariable int topicId)
	{
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/topic/{topicId}/group")
	public ResponseEntity<List<simpleGroupInfo>> getTopicGroupList(@PathVariable int topicId)
	{
		simpleGroupInfo group1=new simpleGroupInfo(23,"1A1");
		simpleGroupInfo group2=new simpleGroupInfo(26,"2A2");
		List<simpleGroupInfo> groupList=new ArrayList<simpleGroupInfo>();
		groupList.add(group1);
		groupList.add(group2);
		return new ResponseEntity(groupList,HttpStatus.OK);
	}
	
}
class reviseTopicInfo
{
	private String serial;
	private String name;
	private String description;
	private int groupLimit;
	private int groupMemberLimit;
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
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
	public int getGroupLimit() {
		return groupLimit;
	}
	public void setGroupLimit(int groupLimit) {
		this.groupLimit = groupLimit;
	}
	public int getGroupMemberLimit() {
		return groupMemberLimit;
	}
	public void setGroupMemberLimit(int groupMemberLimit) {
		this.groupMemberLimit = groupMemberLimit;
	}
}
class simpleGroupInfo
{
	private int id;
	private String name;
	public simpleGroupInfo(int id,String name)
	{
		this.id=id;
		this.name=name;
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
