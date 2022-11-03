package com.dineshonjava.dao;

import java.util.List;

import com.dineshonjava.model.Employee;
import com.dineshonjava.model.ServerEntity;

public interface ServerDao {

	public List<ServerEntity> listServers();

	public void addServer(ServerEntity server);

//	public void deleteServer(ServerEntity server);

	public List<ServerEntity> getServerByEnv(String server);

}
