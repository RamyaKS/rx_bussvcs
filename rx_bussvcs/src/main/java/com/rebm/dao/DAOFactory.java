package com.rebm.dao;

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
		return new ServiceRequestsDAO();
	}

}
