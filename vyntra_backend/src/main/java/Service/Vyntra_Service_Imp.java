package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Vyntra_DAO;
import Model.product;

@Service
@Transactional
public class Vyntra_Service_Imp implements Vyntra_Service {
 
	@Autowired
	private Vyntra_DAO vyntradao;
	
	@Override
	public boolean saveProduct(product pro) {
		return vyntradao.saveProduct(pro);
	}

	@Override
	public List<product> getProducts() {
		return vyntradao.getProducts();
	}


	@Override
	public List<product> getProductByID(product pro) {
		return vyntradao.getProductByID(pro);
	}

	@Override
	public boolean updateProduct(product pro) {
		return vyntradao.updateProduct(pro);
	}

}
