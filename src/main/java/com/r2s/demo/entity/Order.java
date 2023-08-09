package com.r2s.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "delivery_time")
	private Date deliveryTime;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "total_price")
	private long totalPrice;
	
	@Column(name = "status")
	private Date status;
	
	@Column(name = "receiver_name")
	private Date receiverName;
}
