package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.product;

@Repository
public class Vyntra_DAO_Imp  implements Vyntra_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveProduct(product pro) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(pro);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<product> getProducts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<product> query=currentSession.createQuery("from product", product.class);
		List<product> list=query.getResultList();
		return list;
	}


	@Override
	public List<product> getProductByID(product pro) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<product> query=currentSession.createQuery("from product where product_id=:product_id", product.class);
		query.setParameter("product_id", pro.getProduct_id());
		List<product> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateProduct(product pro) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(pro);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
