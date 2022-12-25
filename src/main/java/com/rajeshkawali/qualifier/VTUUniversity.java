package com.rajeshkawali.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("vtu")
//@Component("vtu") //we can use this one also
public class VTUUniversity implements University {

	@Override
	public String display() {

		return "Message from VTU University";
	}
}
/*
@Primary:
When more than one bean qualifies for the dependency to be autowired, 
@Primary specifies which bean should be given preference.
Among the eligible beans, there should be exactly one primary bean.

@Qualifier:
When more than one bean meets the requirements for the dependency, 
we may use a qualifier annotation to explicitly define the bean name and 
let spring know which dependency should be really called for.
*/