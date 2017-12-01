package career.projectcollection.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import career.projectcollectionbackend.dao.CategoryDAO;
import career.projectcollectionbackend.dao.ProductDAO;
import career.projectcollectionbackend.dto.Category;
import career.projectcollectionbackend.dto.Product;

@Controller
@RequestMapping("/manage")

public class ManagementController {
@Autowired
private CategoryDAO categoryDAO;

@Autowired
private ProductDAO productDAO;

@RequestMapping(value="/products",method=RequestMethod.GET)

public ModelAndView showManageProducts(@RequestParam(name="operation",required=false)String operation)
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("userClickMangeProducts",true);
	mv.addObject("title","ManageProducts");
	
	Product nproduct=new Product();
	//set few of the fields
	
	nproduct.setSupplierId(1);
	nproduct.setActive(true);
	mv.addObject("product",nproduct);
	
	if(operation!=null)
	{
	if(operation.equals("product"))
	{
	mv.addObject("message","Product Submited successfully..");
	}
	}

	return mv;
}

@ModelAttribute("categories")
public List<Category> getCategories()
{
	return categoryDAO.list();
			
}

//handling product submission
@RequestMapping(value="/products",method=RequestMethod.POST)
public String handleProductSubmission(@ModelAttribute("product")Product mproduct)
{
	productDAO.add(mproduct);
	return "redirect:/manage/products?operation=product";
}



}
