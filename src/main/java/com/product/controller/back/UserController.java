package com.product.controller.back;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.base.BaseController;
import com.product.domain.UserDO;
import com.product.result.Result;
import com.product.service.UserService;
import com.product.utils.MD5Utils;

/**
 * 用户表
 */

@Controller
@RequestMapping("/")
public class UserController extends BaseController{

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/ajaxLogin")
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
	@ResponseBody
	@RequestMapping("/list")
	public List<UserDO> list(@RequestParam Map<String, Object> params) {
		return userService.list(params);
	}
	
}
