package xmu.crms.view.vo;
/**
 * @author:JennieCheng
 */
public class MeVO {

	private int id;
	private String type;
	private String name;
	private String number;
	private String phone;
	private String email;
	private String gender;
	private String school;
	private String title;
	private String avatar;
	public MeVO(int id, String type, String name,String number, String phone, String email, String gender, String school, String title,
			String avatar) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.number = number;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.school = school;
		this.title = title;
		this.avatar = avatar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
