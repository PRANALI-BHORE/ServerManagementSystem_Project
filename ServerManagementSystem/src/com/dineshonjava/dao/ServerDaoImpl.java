package com.dineshonjava.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dineshonjava.model.Employee;
import com.dineshonjava.model.ServerEntity;

@Repository
public class ServerDaoImpl implements ServerDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public List<ServerEntity> listServers() {
		
		return (List<ServerEntity>) sessionFactory.getCurrentSession().createCriteria(ServerEntity.class).list();
		
	}

	@Override
	public void addServer(ServerEntity server) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(server);
		
	}

	@Override
	public List<ServerEntity> getServerByEnv(String server) {
		 return (List<ServerEntity>)sessionFactory.getCurrentSession().createQuery("select serverName from serverdetails where env=" + server).uniqueResult();
//		return (ServerEntity)sessionFactory.getCurrentSession().get(ServerEntity.class, getServerByEnv(server));
//		 query = "select * from users u where u.name= :name", resultClass = User.class
	}
	
	
	
	
	
	
//		select servername from serverdetails where env="UAT";
//	(Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
	

//	@Override
//	public void deleteServer(ServerEntity server) {
//		sessionFactory.getCurrentSession().createQuery("delete from serverdetails where serverid = "+server.getServerId()).executeUpdate();
//		
//	}
	

}
