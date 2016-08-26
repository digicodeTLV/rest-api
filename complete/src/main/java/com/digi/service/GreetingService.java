package com.digi.service;

import com.digi.entity.Greeting;
import com.digi.entity.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();


	public Greeting greeting (User usr) {
		return new Greeting(counter.incrementAndGet(), String.format(template, usr.getName()));
	}
}
