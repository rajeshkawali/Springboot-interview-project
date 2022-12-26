# Springboot-interview-project
Springboot examples for interviews

### To get text from file 
using @PropertySource and @Value we can retrive data from file (test.txt)

### To read propery values from application.properties file

To get list of values
> @Value("#{'${my.user.list}'.split(',')}")

To get key value pair
> @Value("#{${getMap}}")

To assign properties values to class
> @ConfigurationProperties(prefix = "user.address")

### How to get default valuse if requested property is not present in application.properties file
If "app.name" property is not present in the file then it will not through any exception 
insteaded it will return default value given in @Value annotation using

> @Value("${app.name: This is default value from Value annotation}")

### Inject prototype bean into singleton class
using @Lookup and @Scope("prototype") we can inject prototype bean into singleton class.

### How to exclude embeded tomcat and jetty
The default embedded server is tomcat. Other options available are jetty and underTow
To remove the tomcat starter from your project, exclude tomcat from web dependency. Just add spring-boot-starter-jetty dependency
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
	<exclusions>
		<exclusion>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
		</exclusion>
	</exclusions>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>
```

### Disable embedded tomcat using below flag in application.properties
> spring.main.web-application-type=none

### How to qualify a bean when there are multiple beans available
@Primary indicates that a bean should be given preference when multiple beans are qualified to autowire, there should be exactly one primary bean.

@Qualifier indicates specific bean should be autowired when there are multiple beans.

### To exclude any auto configured files from Spring boot
Using below annotation we can exclude any auto configured file from spring boot application

> @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

### Spring boot profiles
To set specific profile in application.properties use below property

We can also access configuration from class using  @Profile({"prod"})

> spring.profiles.active=local

1. application-local.properties: This properties file will be responsible to add the set of the environments for local.

2. application-dev.properties: This properties file will be responsible to add the set of the environments for development.

3. application-prod.properties: This properties file will be responsible to add the set environment for production.

4. application-test.properties: This properties file will be responsible to add the set of the environments for the test.

### Enable Lazy Initialization
**Set the property value to true means that all the beans in the application will use lazy initialization.**
> spring.main.lazy-initialization=true

### Spring boot actuator
Spring Boot's 'Actuator' dependency is used to monitor and manage the Spring web application

We can modify default endpoint of actuator by adding below flag in application.properties
> management.endpoints.web.base-path=/actuatorDetails

We can enable and disable other actuator endpoints through property files. 
If you want to enable all actuator endpoints, then add following property.
> management.endpoints.web.exposure.include=*

To enable only specific actuator endpoints, provide the list of endpoint id.
> management.endpoints.web.exposure.include=health,info,beans,env,metrics,trace

> URL : http://localhost:8787/actuatorDetails

> URL : http://localhost:8787/actuatorDetails/info
