package xmu.crms.view;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topic/{topicId}")
	public ResponseEntity<Topic> getTopic(@PathVariable BigInteger topicId)
	{
		Topic topic = null;
		try {
			topic = topicService.getTopicByTopicId(topicId);
			return new ResponseEntity<Topic>(topic,HttpStatus.OK);
		} catch (TopicNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<Topic>(topic,HttpStatus.NOT_FOUND);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<Topic>(topic,HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/topic/{topicId}")
	public ResponseEntity reviseTopic(@PathVariable BigInteger topicId,@RequestBody Topic topic)
	{
		try {
			topicService.updateTopicByTopicId(topicId, topic);
			return new ResponseEntity(HttpStatus.OK);
		} catch (TopicNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/topic/{topicId}")
	public ResponseEntity deleteTopic(@PathVariable BigInteger topicId)
	{
		try {
			topicService.deleteTopicByTopicId(topicId);
			return new ResponseEntity(HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
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
	
	@GetMapping("/topic/{topicId}/group/{groupId}")
	public ResponseEntity<SeminarGroupTopic> getTopicGroup(@PathVariable BigInteger topicId, @PathVariable BigInteger groupId)
	{
		SeminarGroupTopic seminarGroupTopic = topicService.getSeminarGroupTopicById(topicId, groupId);
		return new ResponseEntity(seminarGroupTopic,HttpStatus.OK);
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
