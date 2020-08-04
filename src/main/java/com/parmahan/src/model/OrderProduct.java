package com.parmahan.src.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "order_products")
@Access(value = AccessType.FIELD)
public class OrderProduct extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(name = "name")
	private String name;

	@NotBlank
	@Column(name = "description")
	private String description;

	@NotBlank
	@Column(name = "price")
	private BigInteger price;

	@NotBlank
	@Column(name = "quantity")
	private int quantity;

	@NotBlank
	@Column(name = "subtotal")
	private BigInteger subtotal;

	@NotBlank
	@Column(name = "sku")
	private String sku;

	@NotBlank
	@Column(name = "order_id")
	private Order order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getPrice() {
		return price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigInteger getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigInteger subtotal) {
		this.subtotal = subtotal;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
