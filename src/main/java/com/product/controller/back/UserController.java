package com.product.controller.back;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.domain.UserDO;
import com.product.result.Page;
import com.product.result.Result;
import com.product.service.UserService;
import com.product.utils.MD5Utils;
import com.product.utils.Query;
import com.product.utils.ShiroUtils;

/**
 * 用户表
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	
	@RequestMapping({ "/login" })
	public String welcome(Model model) {
		return "login";
	}
	
	@RequestMapping("/ajaxLogin")
	@ResponseBody
	public Result ajaxLogin(String username, String password) {

		password = MD5Utils.encrypt(username, password);
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			return Result.ok();
		} catch (AuthenticationException e) {
			return Result.error("用户或密码错误");
		}
	}
	@RequestMapping("/logout")
	public String logout() {
		ShiroUtils.logout();
		return "redirect:/login";
	}
}
