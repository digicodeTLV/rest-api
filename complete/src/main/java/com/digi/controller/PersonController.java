package com.digi.controller;

import com.digi.entity.db.Person;
import com.digi.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__({@Inject}))
public class PersonController {

	private final PersonService pService;

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> all () {
		List<Person> persons = pService.showAll();
		return ResponseEntity.ok().body(persons);
	}
}
