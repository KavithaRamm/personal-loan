package com.kavitha.personalloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kavitha.personalloan.model.Customer;
import com.kavitha.personalloan.service.LoanService;

@Controller
public class PersonalLoanController {
	@Autowired
	private LoanService loanService;

	@GetMapping(value = "/loan")
	public String applyLoan() {
		return "loan";
	}

	@PostMapping(value = "/loan")
	public String loanStatus(Model model, @ModelAttribute Customer customer) {
		model.addAttribute("customer", customer);
		boolean isapproved = loanService.calculate(customer);
		if (isapproved) {
			return "approval";
		}
		return "denial";
	}
}
