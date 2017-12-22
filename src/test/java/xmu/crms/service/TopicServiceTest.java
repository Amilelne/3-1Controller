package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class TopicServiceTest {
	@Autowired
	private TopicService topicService;
	
	@Test
	public void testUpdateTopicByTopicId() throws IllegalArgumentException, TopicNotFoundException {
		Topic topic=topicService.getTopicByTopicId(new BigInteger("15"));
		topic.setName("话题15");
		topic.setDescription("话题15描述");
		topic.setGroupNumberLimit(9);
		topic.setGroupStudentLimit(5);
		Assert.assertEquals(true,topicService.updateTopicByTopicId(new BigInteger("15"), topic));
	}
	
	@Test
	public void testListTopicBySeminarId() {
		List<Topic> topics=topicService.listTopicBySeminarId(new BigInteger("1"));
		Assert.assertNotNull(topics.get(0));	
	}
	
	@Test
	public void testInsertTopicBySeminarId() {
		Topic topic=new Topic();
		topic.setName("话题14");
		topic.setDescription("话题14描述");
		topic.setGroupNumberLimit(4);
		topic.setGroupStudentLimit(5);
		BigInteger insert=topicService.insertTopicBySeminarId(new BigInteger("1"), topic);
		System.out.println(topic.getId());
		System.out.println(insert);
		Assert.assertNotNull(insert);
	}
	
	@Test
	public void testGetSeminarGroupTopicById() {
		SeminarGroupTopic seminarGroupTopic=topicService.getSeminarGroupTopicById(new BigInteger("1"), new BigInteger("1"));
		Assert.assertNotNull(seminarGroupTopic);
	}
	
	
	
	
}
