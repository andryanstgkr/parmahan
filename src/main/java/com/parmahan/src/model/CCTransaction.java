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
@Table(name = "cc_transactions")
@Access(value = AccessType.FIELD)
public class CCTransaction extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(name = "first_name")
	private String code;

	@NotBlank
	@Column(name = "order_id")
	private Order order;

	@NotBlank
	@Column(name = "trans_date")
	private Date transDate;

	@NotBlank
	@Column(name = "processor")
	private String processor;

	@NotBlank
	@Column(name = "processor_trans_id")
	private String processorTransId;

	@NotBlank
	@Column(name = "amount")
	private BigInteger amount;

	@NotBlank
	@Column(name = "cc_num")
	private String ccNumber;

	@NotBlank
	@Column(name = "cc_type")
	private String ccType;

	@NotBlank
	@Column(name = "response")
	private String response;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getProcessorTransId() {
		return processorTransId;
	}

	public void setProcessorTransId(String processorTransId) {
		this.processorTransId = processorTransId;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}
