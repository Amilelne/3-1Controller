package xmu.crms.view;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.School;
import xmu.crms.service.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/school")
	public ResponseEntity insertSchool(@RequestParam("detail") School school) {
		BigInteger result = schoolService.insertSchool(school);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("/school/city")
	public ResponseEntity<List<School>> getSchoolByCity(@RequestParam("city") String city)
	{
		return new ResponseEntity<List<School>>(schoolService.listSchoolByCity(city),HttpStatus.OK);
	}
	
	@GetMapping(value="/school/province")
	public ResponseEntity<List<String>> getProvince()
	{
		List<String> provinceList=new ArrayList<String>();
		provinceList.add("北京");
		provinceList.add("天津");
		provinceList.add("河北");
		return new ResponseEntity<List<String>>(schoolService.listProvince(),HttpStatus.OK);
	}
	
	@GetMapping(value="/school/province/city")
	public ResponseEntity<List<String>> getCityByProvince(@RequestParam("province") String province)
	{
		List<String> cityList=new ArrayList<String>();
		cityList.add("福州");
		cityList.add("厦门");
		return new ResponseEntity<List<String>>(schoolService.listCity(province),HttpStatus.OK);
	}
	
	@GetMapping("/school/id")
	public ResponseEntity<School> getSchoolBySchoolId(@RequestParam("id") String id){
		
		return new ResponseEntity<School>(schoolService.getSchoolBySchoolId(new BigInteger(id)),HttpStatus.OK);
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