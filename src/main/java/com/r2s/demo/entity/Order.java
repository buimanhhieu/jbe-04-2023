package com.r2s.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
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
	
	@ManyToOne
	@MapsId(value = "user_id")
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@JsonBackReference
	private User user;
	
	@ManyToOne
	@MapsId(value = "address_id")
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	@JsonBackReference
	private Address address;
}
