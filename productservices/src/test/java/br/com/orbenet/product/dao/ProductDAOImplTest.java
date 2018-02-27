package br.com.orbenet.product.dao;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.orbenet.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void testCreateAProduct() {
		// Arrange
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Iphone 8 Plus");
		product.setPrice(1000);

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product);

		// Act
		Product result = dao.read(1);

		// Assert
		assertNotNull(result);
	}

	@Test
	public void testCreateAProductVerifyName() {
		// Arrange
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Iphone 8 Plus");
		product.setPrice(1000);

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product);

		// Act
		Product result = dao.read(1);

		// Assert
		assertEquals("Iphone", result.getName());
	}
	
	@Test
	public void testCreateAProductVerifyDescription() {
		// Arrange
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Iphone 8 Plus");
		product.setPrice(1000);

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product);

		// Act
		Product result = dao.read(1);

		// Assert
		assertEquals("Iphone 8 Plus", result.getDescription());
	}
	
	@Test
	public void testCreateAProductVerifyPrice() {
		// Arrange
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Iphone 8 Plus");
		product.setPrice(1000);

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product);

		// Act
		Product result = dao.read(1);

		// Assert
		assertEquals(1000, result.getPrice());
	}

	@Test
	public void testCreateListOfProducts() {
		// Arrange
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Iphone");
		product1.setDescription("Iphone 8 Plus");
		product1.setPrice(1000);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Galaxy A8 2018");
		product2.setDescription("Samsung Galaxy A8 2018");
		product2.setPrice(580);

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Galaxy S8");
		product3.setDescription("Samsung Galaxy S8");
		product3.setPrice(820);

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product1);
		dao.create(product2);
		dao.create(product3);
		
		// Act		
		int result = dao.list().size();
		
		// Assert
		assertEquals(3, result);
	}
	
	@Test
	public void testUpdateProductName() {
		// Arrange
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Iphone 8 Plus");
		product.setPrice(1000);				

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product);
		
		// Act		
		product.setName("Galaxy A8 2018");
		dao.update(product);
		Product result = dao.read(1);
		
		// Assert
		assertEquals("Galaxy A8 2018", result.getName());
	}
	
	@Test
	public void testUpdateProductPrice() {
		// Arrange
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Iphone 8 Plus");
		product.setPrice(1000);				

		ProductDAO dao = new ProductDAOImpl();
		dao.create(product);
		
		// Act		
		product.setPrice(840);
		dao.update(product);
		Product result = dao.read(1);
		
		// Assert
		assertEquals(840, result.getPrice());
	}

}
