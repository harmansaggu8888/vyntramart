package Service;

import java.util.List;

import Model.product;

public interface Vyntra_Service {

	public boolean saveProduct(product pro);
	public List<product> getProducts();
	public List<product> getProductByID(product pro);
	public boolean updateProduct(product pro);
}
