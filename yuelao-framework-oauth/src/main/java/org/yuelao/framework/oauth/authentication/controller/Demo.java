package org.yuelao.framework.oauth.authentication.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuelao.common.core.web.ResultModel;

@RestController
@RequestMapping("/test")
public class Demo {


	@PreAuthorize("hasAnyAuthority('ADMIN')")
	@GetMapping
	public ResultModel<String> test() {
		return ResultModel.success("SUCCESS");
	}
}
