package com.parmahan.src.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;

@Embeddable
@MappedSuperclass
public class Base {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "inserted_at")
	//@Temporal(TemporalType.TIMESTAMP)
	private Date insertedAt;

	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getInsertedAt() {
		return insertedAt;
	}

	public void setInsertedAt(Date insertedAt) {
		this.insertedAt = insertedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
