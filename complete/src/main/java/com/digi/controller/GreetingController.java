package com.digi.controller;

import com.digi.entity.Greeting;
import com.digi.entity.User;
import com.digi.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequiredArgsConstructor(onConstructor = @__({@Inject}))
public class GreetingController {

	private final GreetingService gService;

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public Greeting greeting (@RequestBody User usr) {
		return gService.greeting(usr);
	}
}
