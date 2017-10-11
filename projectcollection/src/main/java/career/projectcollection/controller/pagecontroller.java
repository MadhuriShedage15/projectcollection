package career.projectcollection.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class pagecontroller {
@RequestMapping(value={"/","/home","/index"})	
public ModelAndView show()
{
	ModelAndView mv=new ModelAndView("page");
	return mv;
}
}
