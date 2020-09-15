package com.parmahan.src.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "orders")
@Access(value = AccessType.FIELD)
public class Order extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*
	@NotBlank
	@Column(name = "name")
	private String name;

	@NotBlank
	@Column(name = "first_name")
	private String description;

	@NotBlank
	@Column(name = "first_name")
	private String referenceNo;

	@NotBlank
	@Column(name = "first_name")
	private String sku;

	@NotBlank
	@Column(name = "first_name")
	private BigDecimal price;

	@NotBlank
	@Column(name = "first_name")
	private int quantity;

	@NotBlank
	@Column(name = "first_name")
	private BigDecimal subtotal;

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

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
*/
}
