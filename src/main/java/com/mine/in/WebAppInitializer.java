package com.mine.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebAppInitializer extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebAppInitializer.class, args);
	}

	@Override
	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(WebAppInitializer.class);
	}

}
