package xmu.crms.dao.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xmu.crms.dao.TopicDao;
import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;

/**
 * @author HuXingBo
 */
public class TopicDaoImpl implements TopicDao{

	@Autowired
	private TopicMapper topicMapper;

	public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
		Topic topic=new Topic();
		if(topicId instanceof BigInteger) {
			throw new IllegalArgumentException("topicId格式错误");
		}else {
			topic=topicMapper.getTopicByTopicId(topicId);
			if(topic==null) {
				throw new TopicNotFoundException("找不到topic或topicId错误");
			}
		}
		return topic;
	}

	public void updateTopicByTopicId(BigInteger topicId, Topic topic)
			throws TopicNotFoundException, IllegalArgumentException {
		// TODO about exception to fail to update
		if(topicId instanceof BigInteger) {
			throw new IllegalArgumentException("topicId格式错误");
		}else if(topicMapper.getTopicByTopicId(topicId)==null) {
			throw new TopicNotFoundException("找不到topic或topicId错误");
		}else {
			int update = topicMapper.updateTopicByTopicId(topicId, topic);
			if(update == 0) {
				//会有更新异常吗？
			}
		}
	}

	public void deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		// TODO about not found topic to be deleted
		if(topicId instanceof BigInteger) {
			throw new IllegalArgumentException("topicId格式错误");
		}else if(topicMapper.getTopicByTopicId(topicId)!=null){
			List<BigInteger> seminarGroupTopicIds = topicMapper.getSeminarGroupTopicIdByTopicId(topicId);
			if(!seminarGroupTopicIds.isEmpty()) {
				topicMapper.deleteStudentScoreGroupById(seminarGroupTopicIds);
			}
			topicMapper.deleteSeminarGroupTopicByTopicId(topicId);
			topicMapper.deleteTopicByTopicId(topicId);
		}
	}

	public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		List<Topic> topics=new ArrayList<Topic>();
		if(seminarId instanceof BigInteger) {
			throw new IllegalArgumentException("seminarId格式错误");
		}else {
			topics=topicMapper.listTopicBySeminarId(seminarId);
		}
		return topics;
	}

	public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
		BigInteger insertId=new BigInteger("0");
		if(seminarId instanceof BigInteger) {
			throw new IllegalArgumentException("seminarId格式错误");
		}else {
			topicMapper.insertTopicBySeminarId(seminarId, topic);
			insertId=topic.getId();
		}
		return insertId;
	}

	public void deleteTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
		if(groupId instanceof BigInteger) {
			throw new IllegalArgumentException("groupId格式错误");
		}else if(topicId instanceof BigInteger) {
			throw new IllegalArgumentException("topicId格式错误");
		}else {
			topicMapper.deleteTopicById(groupId, topicId);
		}
	}

	public void deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
		if(topicId instanceof BigInteger) {
			throw new IllegalArgumentException("topicId格式错误");
		}else {
			topicMapper.deleteSeminarGroupTopicByTopicId(topicId);
		}
	}

	public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId)
			throws IllegalArgumentException {
		SeminarGroupTopic seminarGroupTopic=new SeminarGroupTopic();
		if(topicId instanceof BigInteger) {
			throw new IllegalArgumentException("topicId格式错误");
		}else if(groupId instanceof BigInteger) {
			throw new IllegalArgumentException("groupId格式错误");
		}else {
			seminarGroupTopic=topicMapper.getSeminarGroupTopicById(topicId, groupId);
		}
		return seminarGroupTopic;
	}

	public void deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
		if(seminarId instanceof BigInteger) {
			throw new IllegalArgumentException("seminarId格式错误");
		}else {
			List<Topic> topics=topicMapper.listTopicBySeminarId(seminarId);
			Iterator<Topic> it = topics.iterator();
			while(it.hasNext()) {
				this.deleteTopicByTopicId(it.next().getId());
			}
		}
	}
	
}
