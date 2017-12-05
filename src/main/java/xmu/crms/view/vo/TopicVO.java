package xmu.crms.view.vo;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
/**
 * @author:JennieCheng
 */
public class TopicVO{

	private int id;
	private String serial;
	private String name;
	private String description;
	private int GroupLimit;
	private int GroupMemberLimit;
	private int GroupLeft;
	public TopicVO() {
		super();
	};
	public TopicVO(int id, String serial, String name, String description, int groupLimit, int groupMemberLimit,
			int groupLeft) {
		super();
		this.id = id;
		this.serial = serial;
		this.name = name;
		this.description = description;
		GroupLimit = groupLimit;
		GroupMemberLimit = groupMemberLimit;
		GroupLeft = groupLeft;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getGroupLimit() {
		return GroupLimit;
	}
	public void setGroupLimit(int groupLimit) {
		GroupLimit = groupLimit;
	}
	public int getGroupMemberLimit() {
		return GroupMemberLimit;
	}
	public void setGroupMemberLimit(int groupMemberLimit) {
		GroupMemberLimit = groupMemberLimit;
	}
	public int getGroupLeft() {
		return GroupLeft;
	}
	public void setGroupLeft(int groupLeft) {
		GroupLeft = groupLeft;
	};
	
}
