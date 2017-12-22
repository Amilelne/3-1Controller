package xmu.crms.view;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.GroupNotFoundException;
import xmu.crms.exception.InfoIllegalException;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.service.SeminarGroupService;
import xmu.crms.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author HuXingBo
 */
@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@Autowired
	private SeminarGroupService seminarGroupService;
	
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
	
	//未实现，需集成
	@GetMapping("/topic/{topicId}/group")
	public ResponseEntity<List<SeminarGroup>> getTopicGroupList(@PathVariable BigInteger topicId)
	{
		List<SeminarGroup> seminarGroup=new ArrayList<SeminarGroup>();
		try {
			seminarGroup = seminarGroupService.listGroupByTopicId(topicId);
			return new ResponseEntity(seminarGroup,HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity(seminarGroup,HttpStatus.BAD_REQUEST);
		} catch (GroupNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity(seminarGroup,HttpStatus.NOT_FOUND);
		}
	}
	
}
