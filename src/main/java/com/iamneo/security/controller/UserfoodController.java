package com.iamneo.security.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.RequiredArgsConstructor;
import com.iamneo.security.entity.Userfood;
import com.iamneo.security.service.userfoodService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/auth/userfood")
@RequiredArgsConstructor
public class UserfoodController {

	 private final userfoodService u;

//    @GetMapping("/get/{chefid}")
//	   public List<Userfood> getmovie(@PathVariable("chefid") int chefid) {
//	      return u.getfood(chefid);
//	   }
//    
    @PostMapping("/post1")
    public Userfood addUser(@RequestBody Userfood us) {
    	return u.addUser(us);
    }
}