package com.dineshonjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.dao.ServerDao;
import com.dineshonjava.model.Employee;
import com.dineshonjava.model.ServerEntity;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServerServiceImpl implements ServerService{
	
	@Autowired
	ServerDao serverDao;

	@Override
	public List<ServerEntity> listServers() {
		// TODO Auto-generated method stub
		return serverDao.listServers();
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addServer(ServerEntity server) {
		serverDao.addServer(server);
		
	}

	@Override
	public List<ServerEntity> getServerByEnv(String server) {
		return serverDao.getServerByEnv(server);
		
	}

//	@Override
//	public void deleteServer(ServerEntity server) {
//		serverDao.deleteServer(server);
//		
//	}
	
	
}
