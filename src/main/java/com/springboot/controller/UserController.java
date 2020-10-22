package com.springboot.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.model.User;
import com.springboot.util.Constants;

@Controller

public class UserController {

	@RequestMapping("/displayUsers")
	public ModelAndView displayUserInfo(ModelAndView modelandView)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		List<User> users= objectMapper.readValue(Constants.USER_JSON, new TypeReference<List<User>>() {
		});
		modelandView.addObject("users", users);
		modelandView.setViewName("userDetails.jsp");
		
		return modelandView;

	}

}
