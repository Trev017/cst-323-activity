package com.gcu.controller;

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
@RequestMapping("/login/")
public class LoginController {
	
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	@Autowired
	private SecurityBusinessService security;
	
	@GetMapping("")
	public String display(Model model) {
	model.addAttribute("title", "Login Form");
	model.addAttribute("loginModel", new LoginModel());
	return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		/*
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		*/
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		service.test();
		/*
		System.out.println(String.format("Form with Username of %s and Password of %s", 
				loginModel.getUsername(), loginModel.getPassword()));
		*/
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		List<OrderModel> orders = service.getOrders();
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		return "orders";
	}
}