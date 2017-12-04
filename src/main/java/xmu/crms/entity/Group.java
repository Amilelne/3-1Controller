package xmu.crms.entity;
/**
 * @author:zimu
 */
public class Group {

	private int id;
	private int seminarId;
	private int leaderId;
	public Group(int id, int seminarId, int leaderId) {
		super();
		this.id = id;
		this.seminarId = seminarId;
		this.leaderId = leaderId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeminarId() {
		return seminarId;
	}
	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}
	public int getLeaderId() {
		return leaderId;
	}
	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}
	
}
