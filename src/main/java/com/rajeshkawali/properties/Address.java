package com.rajeshkawali.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
/**
 * @author Rajesh_Kawali
 *
 */
@Data
@Component
@ConfigurationProperties(prefix = "user.address")
public class Address {

	private String city;
	private String state;
	private String country;
	private String pin;

}
