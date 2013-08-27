package com.rebm.util;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.log4j.Logger;

import com.rebm.rest.server.ServiceRequest;

public class RESTServerStartUp{
	static Logger log = Logger.getLogger(RESTServerStartUp.class.getName());    
	JAXRSServerFactoryBean sf = null;
	 Server server = null;

	public void start()
	{
		System.out.println("inside the run method");
		 sf = new JAXRSServerFactoryBean();
	    sf.setResourceClasses(ServiceRequest.class);
	    sf.setAddress("http://localhost:9999/");
	     server = sf.create();
	    
	    System.out.println("inside the run method1");
	    log.info("before server wait");
//	    try {
//			Thread.currentThread().wait(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    log.info("after server wait");
//	    server.stop();
	}
	
	public void stop()
	{
		server.stop();
	}
	
}
