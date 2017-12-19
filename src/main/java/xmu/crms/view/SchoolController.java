package xmu.crms.view;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import xmu.crms.view.vo.TopicVO;
import xmu.crms.entity.School;
import xmu.crms.service.SchoolService;
import xmu.crms.view.vo.SchoolVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping("/")
	public ResponseEntity<List<School>> listSchoolByCity(){
		return new ResponseEntity<List<School>>(schoolService.listSchoolByCity("重庆"),HttpStatus.OK);
	}
	
	@GetMapping("/school")
	public ResponseEntity<List<School>> getSchoolByCity(@RequestParam("city") String city)
	{
		return new ResponseEntity<List<School>>(schoolService.listSchoolByCity(city),HttpStatus.OK);
	}
	
	@PostMapping(value="/school")
	public ResponseEntity createSchool()
	{
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping(value="/school/province")
	public ResponseEntity<List<String>> getProvince()
	{
		List<String> provinceList=new ArrayList<String>();
		provinceList.add("北京");
		provinceList.add("天津");
		provinceList.add("河北");
		return new ResponseEntity<List<String>>(provinceList,HttpStatus.OK);
	}
	
	@GetMapping(value="/school/city")
	public ResponseEntity<List<String>> getCityByProvince(@RequestParam("province") String province)
	{
		List<String> cityList=new ArrayList<String>();
		cityList.add("福州");
		cityList.add("厦门");
		return new ResponseEntity<List<String>>(cityList,HttpStatus.OK);
	}
}
class simpleSchoolInfo
{
	private int id;
	private String name;
	private String province;
	private String city;
	public simpleSchoolInfo(int id,String name,String province,String city)
	{
		this.id=id;
		this.name=name;
		this.province=province;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
class createSchoolInfo
{
	private String name;
	private String province;
	private String city;
	public createSchoolInfo(String name,String province,String city)
	{
		this.name=name;
		this.province=province;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}