package com.rebm.util;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class DocumentCreator {
	
	public static DBObject createServiceRequest()
	{
		return new BasicDBObject().append("name", "test");
	}

}
