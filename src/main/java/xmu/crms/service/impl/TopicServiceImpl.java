package xmu.crms.service.impl;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;
import xmu.crms.service.TopicService;

@Service("TopicService")
public class TopicServiceImpl implements TopicService{
	@Autowired
	private TopicMapper topicMapper;

	public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
		Topic topic=topicMapper.getTopicByTopicId(topicId);
		if(topic==null) {
			throw new TopicNotFoundException();
		}
		return topic;
	}

	public Boolean updateTopicByTopicId(BigInteger topicId, Topic topic)
			throws TopicNotFoundException, IllegalArgumentException {
		Boolean update=topicMapper.updateTopicByTopicId(topicId, topic);
		return update;
	}

	public Boolean deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		List<BigInteger> SeminarGroupTopicIds = topicMapper.getSeminarGroupTopicIdByTopicId(topicId);
		topicMapper.deleteStudentScoreGroupById(SeminarGroupTopicIds);
		topicMapper.deleteSeminarGroupTopicByTopicId(topicId);
		Boolean delete=topicMapper.deleteTopicByTopicId(topicId);
		return delete;
	}

	public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		List<Topic> topics=topicMapper.listTopicBySeminarId(seminarId);
		return topics;
	}

	public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
		BigInteger insert=topicMapper.insertTopicBySeminarId(seminarId, topic);
		return insert;
	}

	public Boolean deleteTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
		Boolean delete=topicMapper.deleteTopicById(groupId, topicId);
		return delete;
	}

	public Boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		Boolean delete=topicMapper.deleteSeminarGroupTopicByTopicId(topicId);
		return delete;
	}

	public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId)
			throws IllegalArgumentException {
		SeminarGroupTopic seminarGroupTopic=topicMapper.getSeminarGroupTopicById(topicId, groupId);
		return seminarGroupTopic;
	}

	public Boolean deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		List<Topic> topics=topicMapper.listTopicBySeminarId(seminarId);
		Iterator<Topic> it = topics.iterator();
		Boolean delete = true;
		while(it.hasNext()) {
			if(this.deleteTopicByTopicId(it.next().getId())==false) {
				delete=false;
			}
		}
		return delete;
	}
	
}
