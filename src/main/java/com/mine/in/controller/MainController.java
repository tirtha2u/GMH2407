package com.mine.in.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage() {
		logger.info("inside homepage");
		return "index";
	}

	@RequestMapping(value = "/heros", method = RequestMethod.GET)
	public @ResponseBody List<String> listAllUsers() {
		List<String> users = new ArrayList<String>();
		users.add("spiderman");
		users.add("batman");
		users.add("superman");

		return users;
	}
}
