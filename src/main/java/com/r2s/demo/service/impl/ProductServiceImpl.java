package com.r2s.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.r2s.demo.DTO.ProductRequestDTO;
import com.r2s.demo.entity.Category;
import com.r2s.demo.entity.Product;
import com.r2s.demo.repository.CategoryRepository;
import com.r2s.demo.repository.ProductRepository;
import com.r2s.demo.service.ProductService;

import jakarta.transaction.Transactional;

@Service(value = "ProductServiceImpl")
public class ProductServiceImpl extends BaseServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getProductsByCategory(int type, Pageable pageable) {
		return productRepository.findByCategoryId(type, pageable);
	}

	@Override
	public Optional<Product> getProductById(long id) {
		return productRepository.findById(id);
	}

	@Override
	@Transactional
	public ResponseEntity<?> createAccount(ProductRequestDTO productRequestDTO) {
		 Optional<Category> category = categoryRepository.findById(productRequestDTO.getCategoryId());

	        Product newProduct = new Product();
	        newProduct.setName(productRequestDTO.getName());
	        newProduct.setPrice(productDto.getPrice());
	        newProduct.setCategory(category);
	        // Cài đặt các trường khác từ DTO

	        return productRepository.save(newProduct);
	}

	@Override
	public ResponseEntity<?> updateProduct(long id, ProductRequestDTO productRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
