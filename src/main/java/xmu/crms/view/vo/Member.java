package xmu.crms.view.vo;

public class Member {

	public int id;
	public String name;
	public String number;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Member(int id, String name,String number) {
		this.id = id;
		this.name = name;
		this.number=number;
	}
}
