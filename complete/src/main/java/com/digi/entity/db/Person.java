package com.digi.entity.db;

import com.digi.entity.IdEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@Entity
@Data
public class Person  extends IdEntity {
	@Basic
	@Column(name = "name")
	private String name;
	@Basic
	@Column(name = "img_url")
	private String imgUrl;
	@Basic
	@Column(name = "skype")
	private String skype;
	@Basic
	@Column(name = "phone")
	private String phone;
	@Basic
	@Column(name = "email")
	private String email;
	@Basic
	@Column(name = "personal_phone")
	private String personalPhone;
	@Basic
	@Column(name = "birth_date")
	private Date birthDate;
	@Basic
	@Column(name = "start_date")
	private Date startDate;
	@Basic
	@Column(name = "end_date")
	private Date endDate;
	@Basic
	@Column(name = "status")
	private Integer status;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "position")
	private Position position;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "branch")
	private Branch branch;
}
