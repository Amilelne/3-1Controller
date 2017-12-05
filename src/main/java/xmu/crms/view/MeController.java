package xmu.crms.view;
/**
 * @author:chengjin
 */
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import xmu.crms.view.vo.MeVO;
import xmu.crms.view.vo.SchoolVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MeController {

	@GetMapping("/me")
	public ResponseEntity<MeVO> createMe() {
		return new ResponseEntity<MeVO>(new MeVO(3486, "student", "张三", "23320152202333", "18911114514", "23320152202333@stu.xmu.edu.cn", "male",new SchoolVO(32,"厦门大学","福建","厦门"), "", "/avatar/3486.png"),HttpStatus.OK);
	}
	
	@PutMapping("/me")
	public ResponseEntity reviseMe(@RequestBody reviseMeInfo reviseInfo)
	{
		return new ResponseEntity(HttpStatus.OK);
	}
	@GetMapping("/signin")
	public ResponseEntity<signInfo> signUp(String code,String state,String success_url)
	{
		return new ResponseEntity<signInfo>(new signInfo(3486,"Student","张三","jwt"),HttpStatus.OK);
	}
}
class reviseMeInfo
{
	private String name;
	private String number;
	private String email;
	private String gender;
	private String title;
	private String avatar;
	public reviseMeInfo(String name,String number,String email,String gender,String title,String avatar)
	{
		this.name=name;
		this.number=number;
		this.email=email;
		this.gender=gender;
		this.title=title;
		this.avatar=avatar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	
}
class signInfo
{
	int id;
	String type;
	String name;
	String jwt;
	public signInfo(int id,String type,String name,String jwt)
	{
		this.id=id;
		this.type=type;
		this.name=name;
		this.jwt=jwt;
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
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	

}
