package com.rebm.rest.server;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.rebm.dao.DAO;
import com.rebm.dao.DAOFactory;

@Path("/request/")
public class ServiceRequest {

	@POST
	@Path("/storeRequest/{requestID}")
	public static Map storeRequest() {
		DAOFactory df = DAOFactory.getInstance();
		if (df != null) {
			DAO dao = df.createServiceRequestDAO();
			dao.fetchServiceRequest(new HashMap());

		}
		return null;
	}

	@POST
	@Path("/fetchRequest/{requestID}")
	public static Map fetchRequest() {
		System.out.println("inside the fetch request");
		DAOFactory df = null;
		df = DAOFactory.getInstance();
		System.out.println("inside the fetch request2 " + df);
		DAO dao = null;
		if (df != null) {
			try {
				dao = df.createServiceRequestDAO();
			} catch (Throwable t) {
				t.printStackTrace();
			}
			System.out.println("inside the fetch request1 " + dao.toString());
			dao.fetchServiceRequest(new HashMap());

		}
		return null;
	}
}
