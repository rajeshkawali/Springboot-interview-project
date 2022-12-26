package com.rajeshkawali.properties;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Rajesh_Kawali
 *
 */
@Slf4j
@Component
public class PropertyList {
	
	public static final String CLASS_NAME = PropertyList.class.getName();

	@Value("#{'${my.user.list}'.split(',')}")
	private List<String> myUserList;
	
	@Value("#{${getMap}}")
	private Map<String, String> getMap;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Email email;

	public List<String> getStaticUserList() {
		String _function = ".getStaticUserList";
		log.info(CLASS_NAME + _function + "::myUserList:");
		myUserList.forEach(System.out::println);
		getAddress();
		return myUserList;
	}

	public void getAddress() {
		String _function = ".getAddress";
		log.info(CLASS_NAME + _function + "::user.address.city: {}",address.getCity());
		log.info(CLASS_NAME + _function + "::user.address.state: {}",address.getState());
		log.info(CLASS_NAME + _function + "::user.address.country: {}",address.getCountry());
		log.info(CLASS_NAME + _function + "::user.address.pin: {}",address.getPin());
		getMap();
	}
	
	public void getMap() {
		String _function = ".getMap";
		log.info(CLASS_NAME + _function + "::ENTER");
		getMap.forEach((k,v)->{
			log.info(CLASS_NAME + _function + "::key: {}, Value: {}",k,v);
		});
		getEmails();
	}
	
	public void getEmails() {
		String _function = ".getEmails";
		log.info(CLASS_NAME + _function + "::ENTER");
		List<String> eList = email.getEmails();
		eList.forEach(System.out::println);
	}
}
