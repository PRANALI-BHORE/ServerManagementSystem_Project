package com.dineshonjava.service;

import java.util.List;

import com.dineshonjava.model.Employee;
import com.dineshonjava.model.ServerEntity;

public interface ServerService {
	
	public List<ServerEntity> listServers();
	
	public void addServer(ServerEntity server);
	
	public List<ServerEntity> getServerByEnv(String server);
	
//	public void deleteServer(ServerEntity server);
}
