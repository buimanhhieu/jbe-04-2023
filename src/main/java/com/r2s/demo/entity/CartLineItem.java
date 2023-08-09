package com.r2s.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart_line_item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartLineItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
