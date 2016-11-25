package com.digi.service;

import com.digi.entity.db.Person;
import com.digi.entity.db.Skill;
import com.digi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tymoshenkol on 26-Aug-16.
 */

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor = @__({@Inject}))
public class PersonService {

    private final PersonRepository repository;

    //@Transactional(readOnly=false)
    public List<Person> showAll() {
        List<Person> persons = repository.findAll();
        /*List<Skill> skills = new ArrayList<>();

        skills.add(new Skill("test4", "blah"));
        skills.add(new Skill("test5", "blah"));

        for (Person p : persons) {
            p.getSkills().addAll(skills);
        }

        repository.save(persons);*/
        return persons;
    }

    public List<Person> showBranchUsers(Integer branchId) {
        return repository.findByBranchId(branchId);
    }

    public List<Person> showCompanyUsers(Integer companyId) {
        return repository.findByBranchCompanyId(companyId);
    }
}
