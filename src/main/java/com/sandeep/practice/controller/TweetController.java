package com.sandeep.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.practice.config.ConfigProperties;
import com.sandeep.practice.model.response.ErrorResponse;

@RestController
@RequestMapping("/twitter")
public class TweetController {
	
    @Autowired
	ConfigProperties conf;
	
	@GetMapping("/checkStatus")
	public ResponseEntity<?> isActive()
	{

		//ErrorResponse res=new ErrorResponse();
		
//		res.setErrorCode("404");
//		res.setMessage("not found");
//		res.setStackTrace("ssskdjgdriotueutmv jjkhshf ffjh fjksfkj");
		
	//	System.out.println(res.getStackTrace());
		
		
		System.out.println(conf.getAccessToken());
		System.out.println(conf.getConsumerApiSecret());
		
	    System.out.println(conf.getAuthToken());
		return new ResponseEntity<>("Success",HttpStatus.OK);
	}
	
	

}
