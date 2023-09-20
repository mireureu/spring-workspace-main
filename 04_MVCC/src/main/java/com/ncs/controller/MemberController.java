package com.ncs.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MemberController {
	@RequestMapping("login")

	public String memberLogin(Member member, Model model, HttpServletRequest request) {

	Member loginMember = memberService.loginMember(member);

	if(loginMember == null) {

	model.addAttribute("msg", "로그인 실패");

	}else {

	model.addAttribute("loginMember", loginMember);

	}

	return "redirect:/";

	}
}
