package com.howtodoinjava.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}

	@RequestMapping("/add")
	public ModelAndView addAccount(AccountForm accountForm) {
		System.out.println(
				"*********Inside addAccount() : " + accountForm.getUsername() + ", " + accountForm.getNotifyType());
		ModelAndView md = new ModelAndView();
		md.setViewName("accountDetails");
		md.addObject("newAcc", accountForm);
		return md;
	}

	// ************************************************************************************************
	@RequestMapping("/addNew")
	public String addAccount(@ModelAttribute("newAccount") AccountForm accountForm, BindingResult result,
			ModelMap map) {
		System.out.println("*********Inside indexForm addAccount() : " + accountForm.getUsername() + ", "
				+ accountForm.getNotifyType());
		if (result.hasErrors()) {
			return "error";
		}
		map.addAttribute("username", accountForm.getUsername());
		map.addAttribute("notifyType", accountForm.getNotifyType());
		return "accountView";
	}

	@RequestMapping(value = "/indexForm", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("indexForm", "accountForm", new AccountForm());
	}
}