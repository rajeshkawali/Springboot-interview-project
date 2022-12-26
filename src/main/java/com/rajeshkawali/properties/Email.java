package com.rajeshkawali.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
/**
 * @author Rajesh_Kawali
 *
 */
@Data
@Component
@ConfigurationProperties(prefix = "my")
public class Email {
	
	List<String> email = new ArrayList<String>();

	public List<String> getEmails() {
		return email;
	}
}