package com.r2s.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.demo.entity.Category;
import com.r2s.demo.repository.CategoryRepository;
import com.r2s.demo.service.CategoryService;

@Service(value = "CategoryServiceImpl")
public class CategoryServiceImpl extends BaseServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll(int type) {
		return this.categoryRepository.findAll();
	}

}
