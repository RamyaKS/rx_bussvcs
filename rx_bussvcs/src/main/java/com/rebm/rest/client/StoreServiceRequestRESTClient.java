package com.rebm.rest.client;

import java.util.Map;

import org.apache.cxf.jaxrs.client.WebClient;

public class StoreServiceRequestRESTClient {
	static final String REST_URI = "http://localhost:9999/request";
	static final String ADD_PATH = "/storeRequest/";
	static final String READ_PATH = "/fetchRequest/";
	static final String ACCEPT_TYPE = "application/json";

	public static void storeRequest(String requestID, Map<String, String> data) {
		WebClient createReqestClient = WebClient.create(REST_URI);
		createReqestClient.path(ADD_PATH).path(requestID).accept(ACCEPT_TYPE).post(data);
		System.out.print("after ws call"+createReqestClient.toString());
		
	}
	public static void fetchRequest(String requestID, Map<String, String> data) {
		WebClient createReqestClient = WebClient.create(REST_URI);
		createReqestClient.path(READ_PATH).path(requestID).accept(ACCEPT_TYPE).post(data);
		System.out.print("after ws call"+createReqestClient.toString());
		
	}
}
