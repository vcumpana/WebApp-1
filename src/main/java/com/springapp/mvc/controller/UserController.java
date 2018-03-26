package com.springapp.mvc.controller;

import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hi there! Please, log in if you want to access our secret page");
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("user") User user) {
		if (userService.checkUser(user)) {
			model.addAttribute(user);
			return "redirect:/allusers";
		} else {
			model.addAttribute("error", "Invalid Details");
			return "error";
		}
	}

	@RequestMapping(value = "/allusers", method = RequestMethod.GET)
	public String showAllUsers(ModelMap model) {
		model.addAttribute("face", "all our ");
		model.addAttribute("users", userService.getAllUsers());
		return "welcome";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showAllUsers(ModelMap model, @RequestParam("gender") Gender gender) {
		if(gender == null)
			return "redirect:/allusers";
		model.addAttribute("face", "all our " + gender);
		model.addAttribute("users", userService.getUsersBySpecifiedGender(gender));
		return "welcome";
	}
}