package com.study.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.jpa.request.TestRequestDto;
import com.study.jpa.response.TestResponseDto;
import com.study.jpa.service.TestService;

@Controller
public class TestController {

	private TestService testService;

	// 생성자 주입방식
	public TestController(TestService testService) {
		this.testService = testService;
	}

	@ResponseBody
	@PostMapping(value = "/write", produces = "application/json")
	public String writer(@RequestBody TestRequestDto RequestDto) {

		String content = testService.write(RequestDto);

		TestResponseDto responseDto = TestResponseDto.builder().writer(content).build();

		return responseDto.toString();
	}

}
