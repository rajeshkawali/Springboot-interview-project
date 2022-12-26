package com.rajeshkawali.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Rajesh_Kawali
 *
 */
@Lazy // @Lazy is mandatory in both the places.(here and in controller)
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

/*
By default, Spring creates all singleton beans eagerly at the startup/bootstrapping of the application context. 
The reason behind this is simple: to avoid and detect all possible errors immediately rather than at runtime.

If we want to create bean when its required then use @Lazy annotation
*/