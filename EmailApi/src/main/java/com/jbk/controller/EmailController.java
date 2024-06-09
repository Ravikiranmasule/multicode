package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.EmailModel;
import com.jbk.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	EmailService service;
	
	@PostMapping("sendemail")
	public ResponseEntity<?> sendEmail(@RequestBody EmailModel em){
		boolean b=service.sendEmail(em.getTo(), em.getSubject(), em.getMsg());
		System.out.println(em);
		if(b) {
			return ResponseEntity.ok("done");
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("failed to send");
		}
		
	
		
		
	}

}
