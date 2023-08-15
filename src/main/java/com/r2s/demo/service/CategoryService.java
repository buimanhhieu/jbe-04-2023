package com.r2s.demo.service;

import java.util.List;

import com.r2s.demo.entity.Category;

public interface CategoryService {
	List<Category> getAll(int type);
}