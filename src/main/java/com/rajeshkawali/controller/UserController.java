package com.rajeshkawali.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.dto.UserDTO;
import com.rajeshkawali.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Rajesh_Kawali
 *
 */
@Slf4j
@RequestMapping("/api")
@RestController
public class UserController {

	public static final String CLASS_NAME = UserController.class.getName();

	@Autowired
	private UserService userService;

	@GetMapping("/v1/getAllUsers")
	public List<UserDTO> getAllUsers() {
		String _function = ".getAllUsers";
		log.info(CLASS_NAME + _function + "::ENTER");
		List<UserDTO> usersList = new ArrayList<>();
		usersList = userService.getAllUsers();
		log.info(CLASS_NAME + _function + "::EXIT");
		return usersList;
	}

	@PostMapping("/v1/addUser")
	public ResponseEntity<?> addUser(@RequestBody UserDTO user) {
		String _function = ".addUser";
		log.info(CLASS_NAME + _function + "::ENTER");
		log.debug(CLASS_NAME + _function + "::Request to add a new User into the DB: {} ", user);
		UserDTO addedUser = userService.addUser(user);
		log.info(CLASS_NAME + _function + "::User SuccessFully added to the DB: {}", addedUser);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
	}

}
