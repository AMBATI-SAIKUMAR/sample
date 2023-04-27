package com.ivisecurity.inventoryManagement.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
	@Value("${ivisecurity.client.app.urls}")
		private String[] appUrls;
		
		@Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                .allowedOrigins(appUrls)
	                .allowedHeaders("*")
	                .allowedMethods("OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE");
	            }
	        };
		
	}

}
