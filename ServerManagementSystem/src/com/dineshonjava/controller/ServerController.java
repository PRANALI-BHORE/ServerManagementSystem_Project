package com.dineshonjava.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dineshonjava.bean.EmployeeBean;
import com.dineshonjava.bean.ServerBean;
import com.dineshonjava.model.Employee;
import com.dineshonjava.model.ServerEntity;
import com.dineshonjava.service.ServerService;

@Controller
public class ServerController {
	
	@Autowired
	ServerService serverService;
	
	@RequestMapping(value="/servers", method = RequestMethod.GET)
	public ModelAndView listServers() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servers",  prepareListofBean(serverService.listServers()));
		return new ModelAndView("serversList", model);
	}
	
	@RequestMapping(value = "/savee", method = RequestMethod.POST)
	public ModelAndView saveServer(@ModelAttribute("command") ServerBean serverBean, 
			BindingResult result) {
		ServerEntity server = prepareModel(serverBean);
		serverService.addServer(server);
		return new ModelAndView("redirect:/addd.html");
	}
	
	@RequestMapping(value = "/addd", method = RequestMethod.GET)
	public ModelAndView addServer(@ModelAttribute("command")  ServerBean serverBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servers",  prepareListofBean(serverService.listServers()));
		return new ModelAndView("addServer", model);
	}
	
//	@RequestMapping(value = "/getServerByEnv", method = RequestMethod.POST) action="/sdnext/save.html"
	@RequestMapping(value = "/getServerByEnv", method = RequestMethod.GET) 
	public ModelAndView getServerByEnv(@ModelAttribute("command") ServerBean s1, 
			BindingResult result) {
		System.out.println("Environment is : "+s1.getEnv());
		System.out.println(s1.getEnv().getClass());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servers", prepareServerBean(serverService.getServerByEnv(s1.getEnv())));
		return new ModelAndView("servers",model);
		
//		Map<String, Object> model=new HashMap();
//		model.put("s1",s1.getEnv());
//		return new ModelAndView("serverByEnv",model);
		
		
//		serverService.getServerByEnv(s1.getEnv());
//		ServerEntity server = s1.getEnv();
//		serverService.addServer(server);
//		return new ModelAndView("redirect:/addd.html");
		
//		Map<String, Object> model=new HashMap();
//		model.put("servers", prepareListofBean(serverService.listServers()));
//		return new ModelAndView("serverByEnv",model);
	}
	
	@RequestMapping(value="/newpage", method = RequestMethod.GET)
	public ModelAndView newpage() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servers",  prepareListofBean(serverService.listServers()));
		return new ModelAndView("serverByEnv", model);
	}
	
	private ServerEntity prepareModel(ServerBean serverBean){
		ServerEntity server = new ServerEntity();
		server.setServerName(serverBean.getServerName());
		server.setServerType(serverBean.getServerType());
		server.setIpAddress(serverBean.getIpAddress());
		server.setPortNumber(serverBean.getPortNumber());
		server.setServerId(serverBean.getServerId());
		server.setCommissionedDate(serverBean.getCommissionedDate());
		server.setIsActive(serverBean.getIsActive());
		server.setOperatingSystem(serverBean.getOperatingSystem());
		server.setTeam(serverBean.getTeam());
		server.setEnv(serverBean.getEnv());
		server.setApplication(serverBean.getApplication());
		server.setUsageCapacity(serverBean.getUsageCapacity());
		serverBean.setServerId(null);
		return server;
	}

	private List<ServerBean> prepareListofBean(List<ServerEntity> servers) {
		List<ServerBean> beans=null;
		if(servers != null && !servers.isEmpty()) {
			beans=new ArrayList<ServerBean>();
			ServerBean bean =null;
			for(ServerEntity server: servers) {
				bean=new ServerBean();
				bean.setServerId(server.getServerId());
				bean.setServerName(server.getServerName());
				bean.setIpAddress(server.getIpAddress());
				bean.setServerType(server.getServerType());
				bean.setPortNumber(server.getPortNumber());
				bean.setCommissionedDate(server.getCommissionedDate());
				bean.setIsActive(server.getIsActive());
				bean.setOperatingSystem(server.getOperatingSystem());
				bean.setTeam(server.getTeam());
				bean.setEnv(server.getEnv());
				bean.setUsageCapacity(server.getUsageCapacity());
				bean.setApplication(server.getApplication());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private ServerBean prepareServerBean(List<ServerEntity> server){
		ServerBean bean = new ServerBean();
		bean.setServerName(((ServerBean) server).getServerName());
		
		return bean;
	}
	
	
}
