package com.devidkarki.rest.webservices.restfulwebservices.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.devidkarki.rest.webservices.restfulwebservices.model.User;
import com.devidkarki.rest.webservices.restfulwebservices.services.UserService;

@Controller
public class UserController {

	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// this method allows user to access a form for creating a new user
	// Model object allows data to be passed to the view
	@GetMapping("/userForm") // URL to access the form
	public String showUserForm(Model model) {

		// Create a new User object for the form
		User user = new User();

		// stores data that gets passed to the user-form
		model.addAttribute("user", user);

		return "userForm"; // Name of your form template
	}

	// @ModelAttribute creates model attribute 'user' of type User populated with
	// the data received from the form
	// @Valid checks if all field requirements are met
	// Model model provides a way to pass data to the view
	@PostMapping("/submitUser")
	public String submitUser(@Valid @ModelAttribute User user, Model model) {

		// adds the validated user object to the model
		// accessible in the template and makes it

		userService.saveUser(user);

		model.addAttribute("user", user);

		return "userDisplay";
	}

}
