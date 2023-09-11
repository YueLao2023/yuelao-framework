package org.yuelao.common.core.constants;

import lombok.Getter;

public enum CustomizationHttpStatus implements HttpStatusCodeConverter {
	/**
	 * 基础状态
	 */
	SUCCESS(2000, "接口请求成功。"),
	/**
	 * 请求异常，通常为未统一处理的异常信息
	 */
	ERROR(5000, "接口请求异常。"),
	
	
	/**
	 * 4000以上的Code 为客户端相关的错误
	 */
	NOT_CERTIFIED(4001, "未认证的请求,请先进行身份认证。"),
	UNAUTHORIZED(4002, "权限不足,请联系管理员提升权限。"),
	TOKEN_EXPIRES(4003, "token 过期,请重新获取。"),
	TOKEN_SIGN_EXCEPTION(4004, "token 签名错误,请确认token是否正确。"),
	TOKEN_PARSE_EXCEPTION(4005, "token 解析异常。"),
	TOKEN_FORMAT_EXCEPTION(4006, "token 格式错误,请检查是否为Authorization:Bearer token格式。"),
	
	USER_NOT_FOUND_EXCEPTION(4007, "请核实用户名是否正确"),
	BAD_CREDENTIALS_EXCEPTION(4008, "请核实凭据是否正确。"),
	
	PROHIBITED_USE_EXCEPTION(4009, "系统禁止使用该账号,请联系管理员进行解锁。"),
	
	CAPTCHA_EXCEPTION(4010, "验证码错误。"),
	
	
	;
	
	
	/**
	 * 错误码
	 */
	@Getter
	private Integer code;
	/**
	 * 错误码描述
	 */
	@Getter
	private String description;
	
	CustomizationHttpStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}
	
	@Override
	public String getName() {
		return this.name();
	}
}
