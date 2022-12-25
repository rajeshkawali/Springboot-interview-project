package com.rajeshkawali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Rajesh_Kawali
 *
 */
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class SpringbootInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInterviewApplication.class, args);
	}

}
