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
@Table(name = "coupons")
@Access(value = AccessType.FIELD)
public class Coupon extends Base implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(name = "code")
	private String code;

	@NotBlank
	@Column(name = "description")
	private String description;

	@NotBlank
	@Column(name = "amount")
	private int active;

	@NotBlank
	@Column(name = "multiple")
	private int multiple;

	@NotBlank
	@Column(name = "value")
	private BigDecimal value;

	@NotBlank
	@Column(name = "start_date")
	private Date startDate;

	@NotBlank
	@Column(name = "end_date")
	private Date endDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getMultiple() {
		return multiple;
	}

	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}