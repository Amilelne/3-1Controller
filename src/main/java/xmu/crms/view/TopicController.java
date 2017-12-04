package xmu.crms.view;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import xmu.crms.entity.Topic;
public class TopicController {
	
	@RequestMapping(value="/topic/{topicId}",method=GET)
	public Topic getTopic(@PathVariable int topicId)
	{
		return new Topic(257,"A","领域模型与模块","Domain model与模块划分",5,6,2);
	}
	
	@RequestMapping(value="/topic/{topicId}",method=PUT)
	public boolean reviseTopic(@PathVariable int topicId,@RequestBody Model model)
	{
		boolean success=true;
		return success;
	}

	@RequestMapping(value="/topic/{topicId}",method=DELETE)
	public boolean deleteTopic(@PathVariable int topicId)
	{
		boolean success=true;
		return success;
	}
	
	@RequestMapping(value="/topic/{topicId}/group",method=GET)
	public boolean getTopicGroup(@PathVariable int topicId)
	{
		boolean success=true;
		return success;
	}
	
}
