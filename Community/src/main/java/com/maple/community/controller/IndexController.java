package com.maple.community.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maple.community.model.MemberModel;
import com.maple.community.service.MemberServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {
	@Autowired
	private MemberServiceImpl memberservice;
	private static final Logger logger = LoggerFactory
			.getLogger(IndexController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public String home(Locale locale, Model model) {
	// logger.info("Welcome home! The client locale is {}.", locale);
	//
	// Date date = new Date();
	// DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
	// DateFormat.LONG, locale);
	//
	// String formattedDate = dateFormat.format(date);
	//
	// model.addAttribute("serverTime", formattedDate );
	//
	// return "home";
	// }

	@RequestMapping("/example")
	public String example() {
		return "example";
	}

	@RequestMapping("/login")
	public void login() {
	}

	@RequestMapping("/")
	// 메인 페이지
	public String index() {
		return "index";
	}

	@RequestMapping("/join")
	// 회원가입 처리
	public String join(HttpServletRequest request,MemberModel model) {
		System.out.println(model.getId()+model.getName()+model.getPasswd());
		if (memberservice.join(model)) {
			return "joinSuccess";
		} else {
			return "joinFail";
		}
	}
}
