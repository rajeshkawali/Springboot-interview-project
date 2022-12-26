package com.rajeshkawali.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Rajesh_Kawali
 *
 */
@Lazy
@Component
public class LazyLoading {

	public LazyLoading() {
		System.out.println("Bean created for LazyLoading class");
	}

	public String display() {
		System.out.println("LazyLoading.display()");
		return "I am lazy";
	}
}
