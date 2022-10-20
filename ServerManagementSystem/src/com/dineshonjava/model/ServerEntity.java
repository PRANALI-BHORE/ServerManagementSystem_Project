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
@Table(name="serverdetails")
public class ServerEntity implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "serverid")
	private Integer serverId;
	
	@Column(name="serverName")
	private String serverName;
	
	@Column(name="IpAddress")
	private String IpAddress;
	
	@Column(name="serverType")
	private String serverType;
	
	@Column(name="portNumber")
	private Integer portNumber;
	
	@Column(name="commissionedDate")
	private String commissionedDate;
	
	@Column(name="isActive")
	private String isActive;
	
	@Column(name="operatingSystem")
	private String operatingSystem;
	
	@Column(name="team")
	private String team;
	
	@Column(name="env")
	private String env;
	
	@Column(name="usageCapacity")
	private String usageCapacity;
	
	@Column(name="application")
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
		return IpAddress;
	}

	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
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
