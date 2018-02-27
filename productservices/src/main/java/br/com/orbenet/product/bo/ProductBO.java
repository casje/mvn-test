package br.com.orbenet.product.bo;

import br.com.orbenet.product.dto.Product;

public interface ProductBO {
	
	void create (Product product);
	
	Product findProduct(int id);

}
