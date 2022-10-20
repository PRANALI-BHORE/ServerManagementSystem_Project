package com.dineshonjava.dao;

import java.util.List;

import com.dineshonjava.model.ServerEntity;

public interface ServerDao {
	
	public List<ServerEntity> listServers();
	
	public void addServer(ServerEntity server);
	
}
