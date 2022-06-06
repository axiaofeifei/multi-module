package com.hhf.controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.hhf.controller
 *
 * @author hehongfei
 * @date 2022/6/6 9:04
 */
@RestController
@RequestMapping("/user")
public class HelloController {

	@GetMapping("/hello")
	public String Hello(){
		return "hello multi-module";
	}

}
