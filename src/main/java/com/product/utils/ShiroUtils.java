package com.product.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.product.domain.UserDO;

public class ShiroUtils {

	public static Subject getSubjct() {
		return SecurityUtils.getSubject();
	}

	public static UserDO getUser() {
		Object object = getSubjct().getPrincipal();
		return (UserDO) object;
	}

	public static Integer getUserId() {
		return getUser().getId();
	}

	public static void logout() {
		getSubjct().logout();
	}

}
