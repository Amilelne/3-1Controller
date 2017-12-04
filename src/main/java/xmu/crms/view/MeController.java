package xmu.crms.view;
/**
 * @author:chengjin
 */
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import xmu.crms.entity.Me;

@Controller
public class MeController {

	@RequestMapping(value="/me",method=GET)
	public Me meController() {
		return new Me(3486, "student", "张三", "23320152202333", "18911114514", "23320152202333@stu.xmu.edu.cn", "male", "", "", "/avatar/3486.png");
	}
	
	@RequestMapping(value="/me",method=PUT)
	public boolean reviseMe(@RequestBody Model model)
	{
		boolean success=true;
		return success;
	}
	@RequestMapping(value="/signin",method=GET)
	public boolean signUp(String code,String state,String success_url)
	{
		boolean success=true;
		return success;
	}
}
