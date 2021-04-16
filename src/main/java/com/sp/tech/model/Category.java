package com.sp.tech.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="category_id_fk")
	private List<Product> products = new ArrayList<>();

	public Category(String name) {
		super();
		this.name = name;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

}
