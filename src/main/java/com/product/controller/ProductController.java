package com.product.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping(value = "/get")
	public ResponseEntity<List<Product>> getProduct() {
        List<Product> product = productRepo.findAll();
        return new ResponseEntity<>(product,HttpStatus.OK);
          
    }
	
	@PostMapping(value = "/post")
	public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        Product createProduct = productRepo.save(product);
        return new ResponseEntity<>(createProduct, HttpStatus.CREATED);
    }


}
