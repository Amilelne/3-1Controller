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

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#getTopicByTopicId(java.math.BigInteger)
	 */
	@Override
	public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
		return topicDao.getTopicByTopicId(topicId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#updateTopicByTopicId(java.math.BigInteger, xmu.crms.entity.Topic)
	 */
	@Override
	public void updateTopicByTopicId(BigInteger topicId, Topic topic)
			throws TopicNotFoundException, IllegalArgumentException {
		topicDao.updateTopicByTopicId(topicId, topic);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#deleteTopicByTopicId(java.math.BigInteger)
	 */
	@Override
	public void deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException, TopicNotFoundException {
		topicDao.deleteTopicByTopicId(topicId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#listTopicBySeminarId(java.math.BigInteger)
	 */
	@Override
	public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		return topicDao.listTopicBySeminarId(seminarId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#insertTopicBySeminarId(java.math.BigInteger, xmu.crms.entity.Topic)
	 */
	@Override
	public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
		return topicDao.insertTopicBySeminarId(seminarId, topic);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#deleteSeminarGroupTopicById(java.math.BigInteger, java.math.BigInteger)
	 */
	@Override
	public void deleteSeminarGroupTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
		topicDao.deleteSeminarGroupTopicById(groupId, topicId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#deleteSeminarGroupTopicByTopicId(java.math.BigInteger)
	 */
	@Override
	public void deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		topicDao.deleteSeminarGroupTopicByTopicId(topicId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#getSeminarGroupTopicById(java.math.BigInteger, java.math.BigInteger)
	 */
	@Override
	public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId)
			throws IllegalArgumentException {
		return topicDao.getSeminarGroupTopicById(topicId, groupId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#listSeminarGroupTopicByGroupId(java.math.BigInteger)
	 */
	@Override
	public List<SeminarGroupTopic> listSeminarGroupTopicByGroupId(BigInteger groupId) throws IllegalArgumentException {
		return topicDao.listSeminarGroupTopicByGroupId(groupId);
	}

	/* (non-Javadoc)
	 * @see xmu.crms.service.TopicService#deleteTopicBySeminarId(java.math.BigInteger)
	 */
	@Override
	public void deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		topicDao.deleteTopicBySeminarId(seminarId);
	}
	
}
