package com.product.controller.open;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.base.BaseController;
import com.product.utils.ShiroUtils;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

	@RequestMapping({ "/", "/index.html" })
	public String index() {
		return "login";
	}

	/**
	 * 登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/login.html")
	public String login() {
		return "login";
	}


	/**
	 * 注册页面
	 * 
	 * @return
	 */
	@RequestMapping("/register.html")
	public String register() {
		return "web/register";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		ShiroUtils.logout();
		return "redirect:/login";
	}
}
