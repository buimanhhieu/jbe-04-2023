package com.r2s.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.r2s.demo.DTO.ProductRequestDTO;
import com.r2s.demo.entity.Category;
import com.r2s.demo.entity.Product;

public interface ProductService {
	List<Category> getProductsByCategory(int type, Pageable pageable);
	Optional<Product> getProductById(long id);
	ResponseEntity<?> createAccount(ProductRequestDTO productRequestDTO);
	ResponseEntity<?> updateProduct(long id, ProductRequestDTO productRequestDTO);
	void deleteProduct(Long id);
}
