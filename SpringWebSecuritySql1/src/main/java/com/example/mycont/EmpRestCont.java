package com.example.mycont;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpRestCont {

	@RequestMapping("/l")
	public String getMsg() {
		return "Working";
	}
}
