package career.projectcollection.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import career.projectcollectionbackend.dao.CategoryDAO;
import career.projectcollectionbackend.dto.Category;

@Controller
public class PageController {
	@Autowired
	CategoryDAO categoryDAO;
@RequestMapping(value={"/home","/"})	
public ModelAndView show()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Home");
	mv.addObject("userClickHome",true);
	return mv;
}
@RequestMapping(value="/about")
public ModelAndView about()
{
	ModelAndView mv1=new ModelAndView("page");
	mv1.addObject("title","About");
	mv1.addObject("userClickAbout",true);
	return mv1;
}

@RequestMapping(value="/contact")
public ModelAndView contact()
{
	ModelAndView mv2=new ModelAndView("page");
	mv2.addObject("title","Contact");
	mv2.addObject("userClickContact",true);
	return mv2;
}
@RequestMapping(value="/product")
public ModelAndView product()
{
	ModelAndView mv2=new ModelAndView("page");
	mv2.addObject("title","Product");
	mv2.addObject("userClickProduct",true);
	return mv2;
}
@RequestMapping(value="/wishlist")
public ModelAndView wishlist()
{
	ModelAndView mv2=new ModelAndView("page");
	mv2.addObject("title","Wishlist");
	mv2.addObject("userClickWishlist",true);
	return mv2;
}
@RequestMapping(value="/show/all/products")
public ModelAndView showAllProducts()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title", "All Products");
	mv.addObject("categories", categoryDAO.list());
	mv.addObject("userClickAllProducts",true);
	return mv;
	
}

@RequestMapping(value="/show/category/{id}/products") 
public ModelAndView showCategoryProducts(@PathVariable("id")int id)
{
	//CategoryDAO to fetch single category
			Category category=null;
			category=categoryDAO.get(id);
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title",category.getName());
	//passing the all category
	mv.addObject("categories", categoryDAO.list());
	//passing the sigle category.
	mv.addObject("category", category);
	mv.addObject("userClickCategoryProducts",true);
	return mv;
	
}



}
