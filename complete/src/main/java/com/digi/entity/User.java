package com.digi.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Embeddable;


import java.io.Serializable;

/**
 * Created by tymoshenkol on 25-Aug-16.
 */
@Getter
@Setter
@Embeddable
public class User implements Serializable {

	@Id
	private String name;
}
