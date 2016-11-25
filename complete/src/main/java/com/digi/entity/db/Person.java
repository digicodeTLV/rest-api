package com.digi.entity.db;

import com.digi.entity.IdEntity;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@Entity
@Data
public class Person extends IdEntity {
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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "person_skill",
            joinColumns = {@JoinColumn(name = "userID", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "skillID", nullable = false, updatable = false)})
    private List<Skill> skills;
}
