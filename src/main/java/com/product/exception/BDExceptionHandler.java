package com.product.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.product.result.Result;
import com.product.utils.HttpUtils;

/**
 * 异常处理器
 */
@RestControllerAdvice
public class BDExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 自定义异常
	 */
	@ExceptionHandler(BDException.class)
	public Result handleBDException(BDException e) {
		logger.error(e.getMessage(), e);
		Result r = new Result();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());
		return r;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public Result handleDuplicateKeyException(DuplicateKeyException e) {
		logger.error(e.getMessage(), e);
		return Result.error("数据库中已存在该记录");
	}

	@ExceptionHandler(org.springframework.web.servlet.NoHandlerFoundException.class)
	public Result noHandlerFoundException(org.springframework.web.servlet.NoHandlerFoundException e) {
		logger.error(e.getMessage(), e);
		return Result.error(404, "没找找到页面");
	}

	@ExceptionHandler(AuthorizationException.class)
	public Object handleAuthorizationException(AuthorizationException e, HttpServletRequest request) {
		logger.error(e.getMessage(), e);
		if (HttpUtils.jsAjax(request)) {
			return Result.error(403, "未授权");
		}
		return new ModelAndView("error/403");
	}

	@ExceptionHandler({ Exception.class })
	public Object handleException(Exception e, HttpServletRequest request) {
		logger.error(e.getMessage(), e);
		if (HttpUtils.jsAjax(request)) {
			return Result.error(500, "服务器错误，请联系管理员");
		}
		return new ModelAndView("error/500");
	}
}
