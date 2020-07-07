package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.product;
import Service.Vyntra_Service;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class Controller {
	
	@Autowired
	private Vyntra_Service vyntraservice;
	
	@PostMapping("save-product")
	public boolean saveProduct(@RequestBody product pro) {
		 return vyntraservice.saveProduct(pro);
		
	}
	
	@GetMapping("product-list")
	public List<product> allProducts() {
		 return vyntraservice.getProducts();
	}
	


	@GetMapping("product/{product_id}")
	public List<product> allproductByID(@PathVariable("product_id") int product_id,product pro) {
		 pro.setProduct_id(product_id);
		 return vyntraservice.getProductByID(pro);
		
	}

}
