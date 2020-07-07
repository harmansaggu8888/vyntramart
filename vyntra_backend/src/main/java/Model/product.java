package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_id;
	private String code;
	private String name;
	private String brand;
	private String description;
	private float unit_price;
	private int quantity;
	private boolean is_active;
	private int category_id;
	private int supplier_id;
	private int purchases;
	private int views;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return name;
	}
	public void setProduct_name(String product_name) {
		this.name = product_name;
	}
	public String getProduct_brand() {
		return brand;
	}
	public void setProduct_brand(String brand) {
		this.brand = brand;
	}
	public float getProduct_price() {
		return unit_price;
	}
	public void getProduct_price(float unit_price) {
		this.unit_price = unit_price;
	}

	
}
