package com.digi.entity.db;

import com.digi.entity.IdEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@Entity
@Data
public class Company  extends IdEntity {
	@Basic
	@Column(name = "name")
	private String name;
	@Basic
	@Column(name = "location")
	private String location;

	@JsonIgnore
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Branch> branches;
}
