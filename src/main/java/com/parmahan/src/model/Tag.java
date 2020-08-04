package com.parmahan.src.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tags")
@Access(value = AccessType.FIELD)
public class Tag extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotBlank
	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}