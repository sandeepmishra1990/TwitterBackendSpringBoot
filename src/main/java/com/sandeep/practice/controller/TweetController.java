package com.sandeep.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.practice.model.response.ErrorResponse;

@RestController
@RequestMapping("/twitter")
public class TweetController {
	
	@Autowired
	ErrorResponse res;
	
	@GetMapping("/checkStatus")
	public ResponseEntity<String> isActive()
	{

		//ErrorResponse res=new ErrorResponse();
		
		res.setErrorCode("404");
		res.setMessage("not found");
		res.setStackTrace("ssskdjgdriotueutmv jjkhshf ffjh fjksfkj");
		
		System.out.println(res.getStackTrace());
		return new ResponseEntity<>("success",HttpStatus.OK);
	}

}
