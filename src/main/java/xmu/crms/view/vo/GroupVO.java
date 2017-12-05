package xmu.crms.view.vo;

import java.util.List;

public class GroupVO {

	public int id;
	public Member leader;
	public List<Member> members;
	public List<TopicVO> topics;
	
	public GroupVO(int groupId,Member leader,List<Member> members,List<TopicVO> topics) {
		this.id = groupId;
		this.leader = leader;
		this.members = members;
		this.topics = topics;
	}
	
	
}
