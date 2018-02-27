package br.com.orbenet.product.dto;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.orbenet.product.dto.Product;

public class ProductTest {
	
	@Test
	public void testPropertieValue_Id()
	{
		// Arrange
		Product product = new Product();
		product.setId(8);
		product.setName("Iphone X");
		product.setDescription("Apple Iphone 8");
		product.setPrice(832);
		
		// Act
		int result = product.getId();
		
		// Assert
		assertEquals(8, result);
	}
	
	@Test
	public void testPropertieValue_Name()
	{
		// Arrange
		Product product = new Product();
		product.setId(8);
		product.setName("Iphone X");
		product.setDescription("Apple Iphone 8");
		product.setPrice(832);
		
		// Act
		String result = product.getName();
		
		// Assert
		assertEquals("Iphone X", result);
	}
	
	@Test
	public void testPropertieValue_Description()
	{
		// Arrange
		Product product = new Product();
		product.setId(8);
		product.setName("Iphone X");
		product.setDescription("Apple Iphone 8");
		product.setPrice(832);
		
		// Act
		String result = product.getDescription();
		
		// Assert
		assertEquals("Apple Iphone 8", result);
	}
	
	@Test
	public void testPropertieValue_Price()
	{
		// Arrange
		Product product = new Product();
		product.setId(8);
		product.setName("Iphone X");
		product.setDescription("Apple Iphone 8");
		product.setPrice(832);
		
		// Act
		int result = product.getPrice();
		
		// Assert
		assertEquals(832, result);
	}
}
