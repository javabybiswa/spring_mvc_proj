package com.naresh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	  @Override
	    protected Class<?>[]getRootConfigClasses(){
              return null;
              
	  }
	  @Override
	     protected Class<?>[]getServletConfigClasses(){
		  return new Class[] {MvcConfiguration.class};
		  
	  }
	    @Override
	      protected String[] getServletMappings() {
	    	  String[] allowedURLMapping= {"/"};
	    	    return allowedURLMapping;
	  }
		    
}
