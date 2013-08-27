package com.rebm.dao;

import com.rebm.util.PropertiesHelper;

public class DAOFactory {
	
	private  static DAOFactory factory ;
	
	private DAOFactory(){
		
	}
	
	public static DAOFactory  getInstance(){
		if(factory == null)
		{
			return new DAOFactory();
		}
		else
		{
			return factory;
		}
	}
	
	public static DAO createServiceRequestDAO(){
		DAO dao = null;
		Class<DAO> clazz = null;
		try {
			 clazz =  (Class<DAO>) Class.forName(PropertiesHelper.loadProperties().getProperty("servicerequest.dao"));
			 dao = (DAO)clazz.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dao;
	}

}
