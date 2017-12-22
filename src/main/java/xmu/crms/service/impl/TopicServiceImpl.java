package xmu.crms.service.impl;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.crms.dao.TopicDao;
import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;
import xmu.crms.service.TopicService;

/**
 * @author HuXingBo
 */
@Service("TopicService")
public class TopicServiceImpl implements TopicService{
	@Autowired
	private TopicDao topicDao;

	public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
		return topicDao.getTopicByTopicId(topicId);
	}

	public void updateTopicByTopicId(BigInteger topicId, Topic topic)
			throws TopicNotFoundException, IllegalArgumentException {
		topicDao.updateTopicByTopicId(topicId, topic);
	}

	public void deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		topicDao.deleteTopicByTopicId(topicId);
	}

	public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		return topicDao.listTopicBySeminarId(seminarId);
	}

	public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
		return topicDao.insertTopicBySeminarId(seminarId, topic);
	}

	public void deleteTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
		topicDao.deleteTopicById(groupId, topicId);
	}

	public void deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		topicDao.deleteSeminarGroupTopicByTopicId(topicId);
	}

	public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId)
			throws IllegalArgumentException {
		return topicDao.getSeminarGroupTopicById(topicId, groupId);
	}

	public void deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		topicDao.deleteTopicBySeminarId(seminarId);
	}
	
}
