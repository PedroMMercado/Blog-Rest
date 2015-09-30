package com.noobcoder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noobcoder.model.User;
import com.noobcoder.service.UserService;


@RestController
public class HomeController {

//	@Autowired
//	UserService userService;
//	
//	// return List<user>
//	@RequestMapping(value = "/user/", method = RequestMethod.GET)
//	public ResponseEntity<List<User>> listAllUsers() {
//		List<User> users = userService.findAllUsers();
//		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//	}
//	
//	// Return user
//	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//	public ResponseEntity<User> getUser(@PathVariable("id") long id) {
//		User user = userService.findById(id);
//		return new ResponseEntity<User>(user, HttpStatus.OK);
//	}


}
