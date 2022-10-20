package com.dineshonjava.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Dinesh Rajput
 *
 */
@Entity
@Table(name="ServerDetails")
public class ServerEntity implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "serverid")
	private Integer serverId;
	
	@Column(name="serverName")
	private String serverName;
	
//	@Column(name="IpAddress")
//	private String IpAddress;
	
	@Column(name="serverType")
	private String serverType;
	
	@Column(name="portNumber")
	private Integer portNumber;

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

//	public String getIpAddress() {
//		return IpAddress;
//	}
//
//	public void setIpAddress(String ipAddress) {
//		IpAddress = ipAddress;
//	}

	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

}
