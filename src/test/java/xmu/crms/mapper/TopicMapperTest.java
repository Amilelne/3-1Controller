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
		Topic topic=topicMapper.getTopicByTopicId(new BigInteger("1"));
		Assert.assertEquals("话题1",topic.getName());
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
}
