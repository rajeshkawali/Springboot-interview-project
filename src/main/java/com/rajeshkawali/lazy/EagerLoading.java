package com.rajeshkawali.lazy;

import org.springframework.stereotype.Component;

/**
 * @author Rajesh_Kawali
 *
 */
@Component
public class EagerLoading {
	
	public EagerLoading() {
		System.out.println("Bean created for EagerLoading class");
	}

	public String display() {
		System.out.println("EagerLoading.display()");
		return "I am eager";
	}
}
