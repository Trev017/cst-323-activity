package com.gcu.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
/*
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
*/

import javax.validation.Valid;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/register/")
public class RegistrationController {
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private SecurityBusinessService security;
	
	@GetMapping("")
	public String display(Model model) {
	model.addAttribute("title", "Registration Form");
	model.addAttribute("loginModel", new LoginModel());
	return "register";
	}
	
	@PostMapping("/doRegister")
	public String doRegister(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Registration Form");
			return "register";
		}
		service.test();
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		List<OrderModel> orders = service.getOrders();
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		return "orders";
	}
}
