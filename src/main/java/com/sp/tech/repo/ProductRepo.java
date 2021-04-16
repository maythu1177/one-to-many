package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
