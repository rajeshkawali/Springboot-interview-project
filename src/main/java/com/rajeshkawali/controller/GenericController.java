package com.rajeshkawali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.lazy.EagerLoading;
import com.rajeshkawali.lazy.LazyLoading;
import com.rajeshkawali.lookup.PrototypeClass;
import com.rajeshkawali.properties.PropertyList;
import com.rajeshkawali.qualifier.University;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Rajesh_Kawali
 *
 */
@Slf4j
@RestController
@PropertySource("/test.txt") // To get text file data use @PropertySource and @Value
@RequestMapping("/api")
public class GenericController {

	public static final String CLASS_NAME = GenericController.class.getName();

	@Value("${app.name: This is default value from Value annotation}")
	private String applicationName;

	@Autowired
	private PrototypeClass prototypeClass; // This will return same object/bean every time we call it.

	@Qualifier("reva")
	@Autowired
	private University university;

	@Autowired
	private PropertyList propertyList;

	@Autowired
	private EagerLoading eagerLoading;

	@Lazy
	@Autowired
	private LazyLoading lazyLoading;

	@GetMapping("/getApplicationName")
	public String getApplicationName() {
		String _function = ".getApplicationName";
		log.info(CLASS_NAME + _function + "::ENTER");
		log.info(CLASS_NAME + _function + "::EXIT");
		return applicationName;
	}

	@GetMapping("/getPrototype")
	public String getPrototypeObject() {
		String _function = ".getPrototypeObject";
		log.info(CLASS_NAME + _function + "::ENTER");
		log.info(CLASS_NAME + _function + "::prototypeClass: {}", prototypeClass); // Same bean every time
		log.info(CLASS_NAME + _function + "::getPrototypeBean: {}", getPrototypeBean());// Different bean every time
		return "Check console for prototype beans";
	}

	@GetMapping("/getUniversity")
	public String getUniversity() {
		String _function = ".getUniversity";
		log.info(CLASS_NAME + _function + "::ENTER");
		log.info(CLASS_NAME + _function + "::university: {}", university.display());
		return university.display();
	}

	@GetMapping("/getPropertyDetails")
	public List<String> getPropertyDetails() {
		String _function = ".getPropertyDetails";
		log.info(CLASS_NAME + _function + "::ENTER");
		return propertyList.getStaticUserList();
	}

	@GetMapping("/lazyAndEagerLoading")
	public String lazyAndEagerLoading() {
		String _function = ".lazyAndEagerLoading";
		log.info(CLASS_NAME + _function + "::EagerLoading: {}", eagerLoading.display());
		log.info(CLASS_NAME + _function + "::LazyLoading: {}", lazyLoading.display());
		return "Check console for beans creation";
	}

	@Lookup
	public PrototypeClass getPrototypeBean() {
		return null;
	}
}