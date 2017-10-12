package career.projectcollection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
@RequestMapping(value={"/","/home"})	
public ModelAndView show()
{
	ModelAndView mv=new ModelAndView("page");
	return mv;
}
}
