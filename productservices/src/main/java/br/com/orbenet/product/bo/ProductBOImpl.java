package br.com.orbenet.product.bo;

import br.com.orbenet.product.dao.ProductDAO;
import br.com.orbenet.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDAO dao;

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) { 
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
