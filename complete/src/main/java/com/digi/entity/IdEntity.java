package com.digi.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class IdEntity implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
}
