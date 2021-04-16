package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
