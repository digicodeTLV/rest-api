package com.digi.service;

import com.digi.entity.db.Person;
import com.digi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.inject.Inject;
import java.util.List;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor = @__({@Inject}))
public class PersonService {

	private final PersonRepository repository;


	public List<Person> showAll() {
		return repository.findAll();
	}

	public List<Person> showBranchUsers(Integer branchId) {
		return repository.findByBranchId(branchId);
	}

	public List<Person> showCompanyUsers(Integer companyId) {
		return repository.findByBranchCompanyId(companyId);
	}
}
