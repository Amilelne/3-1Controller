package xmu.crms.mapper;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import xmu.crms.entity.Topic;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicMapperTest {
	@Autowired
	private TopicMapper topicMapper;
	
	@Test
	public void testGetTopicByTopicId() {
		Topic topic=topicMapper.getTopicByTopicId(new BigInteger("1"));
		Assert.assertEquals("话题1",topic.getName());
	}
}
