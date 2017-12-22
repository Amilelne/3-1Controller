package xmu.crms.dao.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xmu.crms.dao.TopicDAO;
import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;

public class TopicDAOImpl implements TopicDAO{

	@Autowired
	private TopicMapper topicMapper;
	
	public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean updateTopicByTopicId(BigInteger topicId, Topic topic)
			throws TopicNotFoundException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
