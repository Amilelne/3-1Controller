package xmu.crms.view;
/**
 * @author:zimu
 */
import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xmu.crms.entity.Me;

@Controller
public class MeController {

	@RequestMapping(value="/me",method=GET)
	public Me meController() {
		return new Me(3486, "student", "张三", "23320152202333", "18911114514", "23320152202333@stu.xmu.edu.cn", "male", "", "", "/avatar/3486.png");
	}
	
}
