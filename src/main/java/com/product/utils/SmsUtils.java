package com.product.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSON;

public class SmsUtils {

	// 用户平台API账号(非登录账号,示例:N1234567)
	public static String account = "N13621753281";
	// 用户平台API密码(非登录密码)
	public static String pswd = "427917";

	/**
	 * 发送短信验证码
	 * 
	 * @param phone
	 *            手机号码
	 * @param verCode
	 *            验证码
	 * @return
	 */
	public static boolean send(String phone, String verCode) {
		// 短信内容
		String msg = "【一诺仪器】" + verCode + "(短信验证码),该验证码5分钟内有效，切勿转发或告知他人。";

		Map<String, Object> param = new HashMap<>();
		param.put("account", account);
		param.put("password", pswd);
		param.put("msg", msg);
		param.put("phone", phone);
		param.put("report", "true");// 状态报告

		String response = HttpUtils.post("http://smsbj1.253.com/msg/send/json", JSON.toJSONString(param));

		if (response == null) {
			return false;
		}

		Map<String, Object> jsonToMap = JSONUtils.jsonToMap(response);
		if ("0".equals(jsonToMap.get("code"))) {
			return true;
		}

		return false;
	}

	/**
	 * 生成验证码
	 * 
	 * @param charCount
	 *            验证码位数
	 * @return
	 */
	public static String generatingVerCode(int charCount) {
		String charValue = "";
		for (int i = 0; i < charCount; i++) {
			Random r = new Random();
			int randomInt = r.nextInt(10);

			char c = (char) (randomInt + '0');
			charValue += String.valueOf(c);
		}

		return charValue;
	}

}
