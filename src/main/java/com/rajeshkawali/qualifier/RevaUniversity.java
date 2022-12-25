package com.rajeshkawali.qualifier;

import org.springframework.stereotype.Service;

@Service("reva")
//@Component("reva") //we can use this one also
public class RevaUniversity implements University {

	@Override
	public String display() {

		return "Message from Reva University";
	}
}