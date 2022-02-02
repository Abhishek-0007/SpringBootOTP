package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.generateOTP;

import java.util.Random;

@RestController
@RequestMapping("/api/student/")
public class StudentController {


	
	@GetMapping("/get")
	//@RequestMapping(value = "/get", method = RequestMethod.GET)
	public generateOTP getStudent () {
		Random random = new Random();
		int otp = random.nextInt(999999);
		generateOTP generateOTP = new generateOTP(otp, "test");
		return generateOTP;
	}
}
