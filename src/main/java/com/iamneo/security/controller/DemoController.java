package com.iamneo.security.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import lombok.RequiredArgsConstructor;
import com.iamneo.security.entity.User;
import com.iamneo.security.service.UsersService;

@RestController
@RequestMapping("/api/v1/auth")
//@RequiredArgsConstructor
public class DemoController {


	@Autowired
	RestTemplate rest;
    
	@PostMapping("/send")
	public ResponseEntity<String> sendDataToServerA(@RequestBody String data) {
		// Prepare the data to be sent to Server A
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request = new HttpEntity<>(data, headers);
		
		// Replace "http://localhost:8081/api/send-data" with the actual URL of Server A's endpoint
		String serverAResponse = rest.postForObject("http://localhost:8082/api/v1/user/send-data", request, String.class);
		
		return ResponseEntity.ok(serverAResponse);
	}
	
	
	
//    @PostMapping("/sendata")
//    public ResponseEntity<String> sendDataToServerA(@RequestBody String data) {
//    	RestTemplate rest=new RestTemplate();
//    	HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        HttpEntity<String> request = new HttpEntity<>(data, headers);
//
//        String serverAResponse = rest.postForObject("http://localhost:8082/api/v1/user/send-data",request, String.class);
//
//        return ResponseEntity.ok(serverAResponse);
//    }
}
