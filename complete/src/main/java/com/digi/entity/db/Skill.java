package com.digi.entity.db;

import com.digi.entity.IdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill extends IdEntity {
	@Basic
	@Column(name = "name", unique = true)
	private String name;
	@Basic
	@Column(name = "description")
	private String description;
}
