package com.r2s.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "variant_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VariantProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@MapsId(value = "product_id")
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	@JsonBackReference
	private Product product;
	
	@OneToOne(mappedBy = "variantProduct")
	@JsonBackReference
	private Cart cart;
}
