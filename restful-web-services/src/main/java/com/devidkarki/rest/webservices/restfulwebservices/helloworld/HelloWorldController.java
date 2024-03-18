package com.devidkarki.rest.webservices.restfulwebservices.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello"; // This string refers to the template name
	}
}
