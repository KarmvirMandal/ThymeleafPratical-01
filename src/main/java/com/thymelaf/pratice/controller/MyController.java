package com.thymelaf.pratice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {

		model.addAttribute("name", "karmvir kumar");
		model.addAttribute("currentDate", new Date().toLocaleString());
		System.out.println("Inside about handler..!!");
		return "about";
		// about.html
	}

	// Handling Iteration

	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		List<String> names = List.of("Karmvir", "Raushan", "Amisha");
		m.addAttribute("names", names);
		return "iterate";
	}

	// Handler for Conditional Statement

	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("Handler conditional statement");
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");
		List<Integer> list = List.of(12);
		m.addAttribute("mylist", list);
		return "condition";
	}

	// Handler for including Fragments
	@GetMapping("/service")
	public String serviceHandler(Model m) {

		m.addAttribute("title", "THIS IS TITLE");
		m.addAttribute("subtitle", "THIS IS SUBSTITLE");

		return "service";
	}

	// new about
	@GetMapping("/aboutnew")
	public String newAbout() {

		return"AboutNew";
	}
}
