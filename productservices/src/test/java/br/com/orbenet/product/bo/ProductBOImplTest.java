package br.com.orbenet.product.bo;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.orbenet.product.dto.Product;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:beans.xml"})
public class ProductBOImplTest extends AbstractJUnit4SpringContextTests {
	
	@Test
	public void testCreateProductWithProductBO()
	{		
		// Arrange
		Product product = new Product();
		product.setId(12);
		product.setName("Iphone 8");
		product.setDescription("Apple Iphone 8 Second Edition");
		product.setPrice(835);
		
		ProductBO productBO = (ProductBOImpl) applicationContext.getBean("productbo");
		productBO.create(product);
		
		// Act
		Product result = productBO.findProduct(12);
		
		// Assert
		assertNotNull(result);
		assertEquals(product.getId(), result.getId());
	}	
	
	@Test
	public void testCreateProductAndVerifyName()
	{
		// Arrange
		Product product = new Product();
		product.setId(12);
		product.setName("Iphone 8");
		product.setDescription("Apple Iphone 8 Second Edition");
		product.setPrice(835);
				
		ProductBO productBO = (ProductBOImpl) applicationContext.getBean("productbo");
		productBO.create(product);
		
		// Act
		Product result = productBO.findProduct(12);
		
		// Assert
		assertNotNull(result);
		assertEquals(product.getName(), result.getName());
	}
	
	@Test
	public void testCreateProductAndVerifyDescription()
	{
		// Arrange
		Product product = new Product();
		product.setId(12);
		product.setName("Iphone 8");
		product.setDescription("Apple Iphone 8 Second Edition");
		product.setPrice(835);
		
		ProductBO productBO = (ProductBOImpl) applicationContext.getBean("productbo");
		productBO.create(product);
		
		// Act
		Product result = productBO.findProduct(12);
		
		// Assert
		assertNotNull(result);
		assertEquals(product.getDescription(), result.getDescription());
	}
	
	@Test
	public void testCreateProductAndVerifyPrice()
	{
		// Arrange
		Product product = new Product();
		product.setId(12);
		product.setName("Iphone 8");
		product.setDescription("Apple Iphone 8 Second Edition");
		product.setPrice(835);
		
		ProductBO productBO = (ProductBOImpl) applicationContext.getBean("productbo");
		productBO.create(product);
		
		// Act
		Product result = productBO.findProduct(12);
		
		// Assert
		assertNotNull(result);
		assertEquals(product.getPrice(), result.getPrice());
	}
}
