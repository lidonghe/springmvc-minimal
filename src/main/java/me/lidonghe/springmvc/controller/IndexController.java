package me.lidonghe.springmvc.controller;

import me.lidonghe.springmvc.model.Greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class IndexController {
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Greeting getGreeting(@PathVariable String name) {
		return new Greeting(name);
	}
} 