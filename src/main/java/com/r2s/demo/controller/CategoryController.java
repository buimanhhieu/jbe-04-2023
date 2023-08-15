package com.r2s.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.demo.entity.Category;
import com.r2s.demo.service.CategoryService;

@RestController
@RequestMapping(path = "categories")
public class CategoryController {
	@Autowired
	@Qualifier(value = "CategoryServiceImpl")
	private CategoryService categoryService;
	
	@GetMapping(path="")
	@ResponseBody
	public List<Category> getAllCategories(@RequestParam (defaultValue = "0")int type){
		return this.categoryService.getAll(type);
	}

}
