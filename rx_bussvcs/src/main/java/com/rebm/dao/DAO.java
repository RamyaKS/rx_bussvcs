package com.rebm.dao;

import java.util.Map;

import com.rebm.util.DBException;

public interface DAO {
	
	public void addServiceRequest(Map<String, String> map) throws DBException;
	
	public void fetchServiceRequest(Map<String, String> map) throws DBException;

}
