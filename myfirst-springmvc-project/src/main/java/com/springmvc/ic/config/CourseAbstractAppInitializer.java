package com.springmvc.ic.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CourseAbstractAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {CourseAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
//		String arr[]= {"/mywebsite.com/*","/"};
		String arr[]= {"/"};
		return arr;
	}

}
