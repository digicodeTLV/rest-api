package com.digi.repository;

import com.digi.entity.db.Branch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
	List<Branch> findByCompanyId(Integer id);
}
