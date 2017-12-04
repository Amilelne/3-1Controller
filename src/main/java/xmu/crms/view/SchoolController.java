package xmu.crms.view;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import xmu.crms.entity.School;

public class SchoolController {
	@RequestMapping(value="/school?city= {city}",method=GET)
	public List<School> getSchoolByCity(@PathVariable String city)
	{
		List<School> schoolList=new ArrayList<School>();
		return schoolList;
	}
	@RequestMapping(value="/school",method=POST)
	public int createSchool(@RequestBody Model model)
	{
		int id=38;
		return id;
	}
	@RequestMapping(value="/school/province",method=POST)
	public List<String> getProvince()
	{
		List<String> provinceList=new ArrayList<String>();
		return provinceList;
	}
	@RequestMapping(value="/shcool/city?province= {province}",method=GET)
	public List<String> getCityByProvince(@RequestBody String province)
	{
		List<String> cityList=new ArrayList<String>();
		return cityList;
	}
}
