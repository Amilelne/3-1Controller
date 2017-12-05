package xmu.crms.view.vo;

import java.util.List;

public class GroupVO {

	public int id;
	public String name;
	public Member leader;
	public List<Member> members;
	public List<TopicVO> topics;
	
	public GroupVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupVO(int groupId,Member leader,List<Member> members,List<TopicVO> topics) {
		this.id = groupId;
		this.leader = leader;
		this.members = members;
		this.topics = topics;
	}

	public GroupVO(int id, String name, Member leader, List<Member> members, List<TopicVO> topics) {
		super();
		this.id = id;
		this.name = name;
		this.leader = leader;
		this.members = members;
		this.topics = topics;
	}
	
	public void setLeader(MeVO meVO) {
		this.leader.id = meVO.getId();
		this.leader.name = meVO.getName();
	}
	
	public void addMember(MeVO meVO) {
		Member newMember = new Member();
		newMember.id = meVO.getId();
		newMember.name = meVO.getName();
		members.add(newMember);
	}
}
