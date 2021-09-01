package com.japcdev.coursesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.japcdev.coursesapp.controller")
@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Override
   public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/toBack").setViewName("index");
        registry.addViewController("/toNew").setViewName("new-course");
        registry.addViewController("/toSelectDuraction").setViewName("selectDuration");
   }   
}
