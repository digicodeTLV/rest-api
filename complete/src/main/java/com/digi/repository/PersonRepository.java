package com.digi.repository;

import com.digi.entity.db.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	List<Person> findByBranchId (Integer id);
	List<Person> findByBranchCompanyId (Integer id);
}
