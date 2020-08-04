package com.parmahan.src.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "products")
@Access(value = AccessType.FIELD)
public class Product extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(name = "sku")
	private String sku;

	@NotBlank
	@Column(name = "name")
	private String name;

	@NotBlank
	@Column(name = "description")
	private String description;

	@NotBlank
	@Column(name = "product_status_id")
	private ProductStatus productStatus;

	@NotBlank
	@Column(name = "taxable")
	private boolean taxable;

	@NotBlank
	@Column(name = "regular_price")
	private BigInteger regularPrice;

	@NotBlank
	@Column(name = "discount_price")
	private BigInteger discountPrice;

	@NotBlank
	@Column(name = "quantity")
	private int quantity;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

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

	public ProductStatus getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}

	public BigInteger getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(BigInteger regularPrice) {
		this.regularPrice = regularPrice;
	}

	public BigInteger getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigInteger discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
