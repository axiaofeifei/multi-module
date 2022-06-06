package com.hhf.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

/**
 * com.hhf.controller
 *
 * @author hehongfei
 * @date 2022/6/6 9:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/printUser")
	public String printUser(User user) {
		System.out.println("----------------------------------------------");
		return user.toString();
	}

	@RequestMapping("/print")
	public JSONObject print(User user) {
		System.out.println("----------------------------------------------");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name",user.getName());
		jsonObject.put("age",user.getAge());

		return jsonObject;
	}


	@RequestMapping("/print2")
	public String print2(User user) {
		System.out.println("----------------------------------------------");

		String strUser = JSONObject.toJSONString(user);

		return strUser;
	}
}