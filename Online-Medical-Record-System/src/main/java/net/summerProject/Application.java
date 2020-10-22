package net.summerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	//this method enables the connection with an external server (Apache Tomcat)
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	 return application.sources(Application.class);
	 }
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
