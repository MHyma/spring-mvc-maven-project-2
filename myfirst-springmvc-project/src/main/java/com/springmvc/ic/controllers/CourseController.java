package com.springmvc.ic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.ic.dto.UserInfoDto;

@Controller
public class CourseController {

//	@RequestMapping("/")
//	public String showHomePage(Model model) {
//		UserInfoDto userInfo=new UserInfoDto();
//		model.addAttribute("userInfo", userInfo);
//		return "home-page";
//	}
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDto userInfoDto ) {
		return "home-page";
	}
	
//	@RequestMapping("/process-homepage")
//	public String resultPage(@RequestParam("userName") String userName1, 
//			@RequestParam("courseName") String courseName1, Model model) {
//		model.addAttribute("userName", userName1);
//		model.addAttribute("courseName", courseName1);
//		return "result-page";
//	}
	
//	@RequestMapping("/process-homepage")
//	public String resultPage(UserInfoDto userInfoDto, Model model) {
//		
//		model.addAttribute("userInfo", userInfoDto);
////		model.addAttribute("userName", userInfoDto.getUserName());
////		model.addAttribute("courseName", userInfoDto.getCourseName());
//		
//		System.out.println(userInfoDto.getUserName());
//		System.out.println(userInfoDto.getCourseName());
//		return "result-page";
//	}
//	
	@RequestMapping("/process-homepage")
	public String resultPage(@ModelAttribute("userInfoDto") UserInfoDto userInfoDto) {
				return "result-page";
	}
	
}
