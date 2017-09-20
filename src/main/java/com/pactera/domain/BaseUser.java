package com.pactera.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
public class BaseUser implements Serializable {

	private static final long serialVersionUID = -1322306357143355240L;

	@Id
	private Long id;

	private String name;

	private Integer age;

	private String password;

	private String username;

	@Column(name = "org_id")
	private Long orgId;

}
