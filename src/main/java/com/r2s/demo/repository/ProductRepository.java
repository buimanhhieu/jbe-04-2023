package com.r2s.demo.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.r2s.demo.entity.Category;
import com.r2s.demo.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Category> findByCategoryId(int type, Pageable pageable);

}
