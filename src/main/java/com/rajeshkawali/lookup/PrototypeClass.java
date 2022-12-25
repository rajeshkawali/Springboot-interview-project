package com.rajeshkawali.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Rajesh_Kawali
 *
 */
@Component
@Scope("prototype") // This will create new bean every time when we call it.
public class PrototypeClass {
	
}


/*
Bean Scopes:-> refers to the lifecycle of Bean that means when the object of 
Bean will be instantiated, how long does that object live, and how many objects 
will be created for that bean throughout. Basically, it controls the instance 
creation of the bean and it is managed by the spring container.


Singleton: Only one instance will be created for a single bean definition per 
Spring IoC container and the same object will be shared for each request made for that bean.

Prototype: A new instance will be created for a single bean definition every 
time a request is made for that bean.

Request: A new instance will be created for a single bean definition every time an 
HTTP request is made for that bean. But Only valid in the context of a web-aware Spring ApplicationContext.

Session: Scopes a single bean definition to the lifecycle of an HTTP Session. 
But Only valid in the context of a web-aware Spring ApplicationContext.

Global-Session: Scopes a single bean definition to the lifecycle of a global HTTP Session. 
It is also only valid in the context of a web-aware Spring ApplicationContext.
*/