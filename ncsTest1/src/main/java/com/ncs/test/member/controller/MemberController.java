package com.ncs.test.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncs.test.member.model.service.MemberService;
import com.ncs.test.member.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping("signUp")
	public String MembersignUp(Member member, Model model, HttpServletRequest request) {
		Member signupMember = memberService.signupMember(member);
		HttpSession session = request.getSession();
		if(signupMember == null) {
			model.addAttribute("msg", "회원가입 실패");
		} else {
			session.setAttribute("signupMember", signupMember);
			return "redirect:/";
		}
	}
}
