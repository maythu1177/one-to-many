package com.sp.tech.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sp.tech.model.Category;
import com.sp.tech.model.Product;
import com.sp.tech.repo.CategoryRepo;

@Service
public class ProductService {

	private final CategoryRepo categoryRepo;

	public ProductService(CategoryRepo categoryRepo) {
		this.categoryRepo = categoryRepo;
	}

	@Transactional
	public void saveCategory() {

		Category c1 = new Category("Fruits");
		Category c2 = new Category("Meats");
		Category c3 = new Category("Diary");

		Product p1 = new Product("apple", 23, 2000);
		Product p2 = new Product("orange", 20, 4000);

		Product p3 = new Product("Fish", 2, 2000);
		Product p4 = new Product("Pork", 2, 8000);

		Product p5 = new Product("Butter", 1, 5000);
		Product p6 = new Product("Milk", 2, 10000);

		c1.addProduct(p1);
		c1.addProduct(p2);

		c2.addProduct(p3);
		c2.addProduct(p4);

		c3.addProduct(p5);
		c3.addProduct(p6);

		categoryRepo.save(c1);
		categoryRepo.save(c2);
		categoryRepo.save(c3);

	}

}
