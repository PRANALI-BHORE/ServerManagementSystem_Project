package com.dineshonjava.bean;

/**
 * @author Dinesh Rajput
 *
 */
public class ServerBean {
	private Integer serverId;
	private String serverName;
//	private String ipAddress;
	private String serverType;
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
//		return ipAddress;
//	}
//	public void setIpAddress(String ipAddress) {
//		this.ipAddress = ipAddress;
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
