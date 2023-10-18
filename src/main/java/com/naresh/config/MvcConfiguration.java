package com.naresh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
@ComponentScan("com.naresh.*")
public class MvcConfiguration extends WebMvcConfigurationSupport{
  
	   
}
