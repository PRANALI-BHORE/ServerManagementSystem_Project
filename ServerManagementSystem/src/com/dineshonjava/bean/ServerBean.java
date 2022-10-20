package com.dineshonjava.bean;

/**
 * @author Dinesh Rajput
 *
 */
public class ServerBean {
	private Integer serverId;
	private String serverName;
	private String ipAddress;
	private String serverType;
	private Integer portNumber;
	private String commissionedDate;
	private String isActive;
	private String operatingSystem;
	private String team;
	private String env;
	private String usageCapacity;
	private String application;
	
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
	
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
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
	
	public String getCommissionedDate() {
		return commissionedDate;
	}
	public void setCommissionedDate(String commissionedDate) {
		this.commissionedDate = commissionedDate;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getUsageCapacity() {
		return usageCapacity;
	}
	public void setUsageCapacity(String usageCapacity) {
		this.usageCapacity = usageCapacity;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	
	
}
