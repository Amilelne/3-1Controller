package xmu.crms.mapper;

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

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(true)
public class TopicMapperTest {
	@Autowired
	private TopicMapper topicMapper;
	
	@Test
	public void testGetTopicByTopicId() {
		Topic topic=topicMapper.getTopicByTopicId(new BigInteger("2"));
		Assert.assertEquals("话题2",topic.getName());
	}
	
	@Test
	public void testGetSeminarGroupTopicIdByTopicId() {
		List<BigInteger> seminarGroupTopicIds=topicMapper.getSeminarGroupTopicIdByTopicId(new BigInteger("3"));
		Assert.assertNotNull(seminarGroupTopicIds);
	}
	
	@Test
	@Rollback(true)
	public void testDeleteStudentScoreGroupById() {
		List<BigInteger> seminarGroupTopicIds=topicMapper.getSeminarGroupTopicIdByTopicId(new BigInteger("3"));
		Assert.assertEquals(true,topicMapper.deleteStudentScoreGroupById(seminarGroupTopicIds));
	}
	
//	@Test
//	@Rollback(true)
//	public void testDeleteTopicByTopicId() {
//		Assert.assertEquals(true,topicMapper.deleteTopicByTopicId(new BigInteger("3")));
//	}
	
	@Test
	public void testListSeminarGroupTopicByGroupId() {
		List<SeminarGroupTopic> seminarGroupTopics=topicMapper.listSeminarGroupTopicByGroupId(new BigInteger("1"));
		Assert.assertNotNull(seminarGroupTopics);
	}
	
	@Test
	public void testUpdateTopicByTopicId() {
		Topic topic=new Topic();
		topic.setDescription("话题说明5更新");
		System.out.println(topic.getDescription());
		int update=topicMapper.updateTopicByTopicId(new BigInteger("5"), topic);
		Assert.assertNotEquals(0, update);
	}
}
