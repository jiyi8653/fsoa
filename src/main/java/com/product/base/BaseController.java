package com.product.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.product.domain.UserDO;
import com.product.service.UserService;

@Controller
public class BaseController {

	@Autowired
	private UserService userService;

	public UserDO getUser(String token) {
		if (token == null) {
			return null;
		}

		Map<String, Object> param = new HashMap<>();
		param.put("token", token);
		List<UserDO> list = userService.list(param);

		if (list.size() > 0) {
			return list.get(0);
		}

		return null;
	}

}