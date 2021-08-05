package com.springmvc.ic.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CourseApplicationInitializer // implements  WebApplicationInitializer {
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// XML Configuration - in java based
		
//		XmlWebApplicationContext webApplicationContext= new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("classpath:beans.xml");
		
		
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(CourseAppConfig.class);
		
		DispatcherServlet dispatcherServlet= new DispatcherServlet(webApplicationContext);
		
		ServletRegistration.Dynamic myCustomServletDispatcherServlet= servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myCustomServletDispatcherServlet.setLoadOnStartup(1);
		myCustomServletDispatcherServlet.addMapping("/mywebsite.com/*");
	}

}
