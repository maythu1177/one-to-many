package com.sp.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.tech.service.ProductService;

@SpringBootApplication
public class OneToManyDemoApplication  implements CommandLineRunner {
	
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productService.saveCategory();
		
	}

}
