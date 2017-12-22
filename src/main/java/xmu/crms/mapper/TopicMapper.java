package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import xmu.crms.entity.Topic;

public interface TopicMapper {
	public Topic getTopicByTopicId(BigInteger topicId);
	
	public Boolean updateTopicByTopicId(@Param("topicId")BigInteger topicId,@Param("topic")Topic topic);
	
	public Boolean deleteTopicByTopicId(@Param("topicId")BigInteger topicId,@Param("seminarId")BigInteger seminarId);
	
	public List<Topic> listTopicBySeminarId(BigInteger seminarId);
	
	public BigInteger insertTopicBySeminarId(@Param("seminarId")BigInteger seminarId,@Param("topic")Topic topic);
	
	public Boolean deleteTopicById(@Param("groupId")BigInteger groupId,@Param("topicId")BigInteger topicId);
	
	public Boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId);
	
	public Boolean deleteTopicBySeminarId(BigInteger seminarId);
}
