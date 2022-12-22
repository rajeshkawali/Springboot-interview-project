package com.rajeshkawali.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/**
 * @author Rajesh_Kawali
 *
 */
@Slf4j
@RestController
@PropertySource("/test.txt") //To get text file data use @PropertySource and @Value
@RequestMapping("/api")
public class GenericController {
	
	public static final String CLASS_NAME = GenericController.class.getName();

	@Value("${app.name}")
	private String applicationName;
	
	@GetMapping("/getApplicationName")
	public String getApplicationName() {
		String _function = ".getApplicationName";
		log.info(CLASS_NAME + _function + "::ENTER");
		log.info(CLASS_NAME + _function + "::EXIT");
		return applicationName;
	}
	
}