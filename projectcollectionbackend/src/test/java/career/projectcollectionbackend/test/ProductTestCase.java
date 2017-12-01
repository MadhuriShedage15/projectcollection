package career.projectcollectionbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import career.projectcollectionbackend.dao.ProductDAO;
import career.projectcollectionbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private static Product product;
	
	@BeforeClass
	public static void init()
	{
	context=new AnnotationConfigApplicationContext();
	context.scan("career.projectcollectionbackend");
	context.refresh();
	productDAO=(ProductDAO) context.getBean("productDAO");
	}

	@Test
	
	public void madhuri()
	{
		product=new Product();
		product.setActive(true);
		product.setBrand("reebok");
		product.setCode("400701");
		product.setDescription("denim");
		product.setId(6);
		product.setName("shirt");
		//product.setPurchase(1000);
		//product.setQuantity(1);
		product.setSupplierId(1);
		product.setCategoryId(1);
		product.setUnitPrice(2000);
		//product.setViews(1);
		
	assertEquals("successfully saved",true,productDAO.add(product) );
		
	}
	
}
