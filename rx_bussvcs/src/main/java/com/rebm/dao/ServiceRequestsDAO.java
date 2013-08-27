package com.rebm.dao;

import java.net.UnknownHostException;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.rebm.util.DocumentCreator;

public class ServiceRequestsDAO implements DAO {

	static Logger log = LogManager.getLogger(ServiceRequestsDAO.class
			.getName());

	public  void addServiceRequest(Map<String, String> map)
	{
		DB db = getConnection().getDB("rebm");
		DBCollection collection = db.getCollection("servicerequest");
		DBObject object = DocumentCreator.createServiceRequest();
		collection.save(object);
		
	}

	public void fetchServiceRequest(Map<String, String> map) {
		System.out.println("inside the fetch");
		DB db = getConnection().getDB("rebm");
		DBCollection collection = db.getCollection("servicerequest");
		DBObject object = DocumentCreator.createServiceRequest();
		DBCursor cursor = collection.find(object);
		while(cursor.hasNext())
		{
			BasicDBObject obj = (BasicDBObject)cursor.next();
//			obj.get("name");
			System.out.println(obj.get("name"));
		}

	}

	private static Mongo getConnection() {
		MongoClient connection = null;
		try {
			connection = new MongoClient(new ServerAddress("localhost"));
			log.info(connection.getVersion());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("after connection failed");
			return null;
		}
		return connection;
	}

}
