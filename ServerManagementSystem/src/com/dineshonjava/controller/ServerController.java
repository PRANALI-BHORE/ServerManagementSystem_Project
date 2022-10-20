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
	
	private ServerEntity prepareModel(ServerBean serverBean){
		ServerEntity server = new ServerEntity();
		server.setServerName(serverBean.getServerName());
		server.setServerType(serverBean.getServerType());
//		server.setIpAddress(serverBean.getIpAddress());
		server.setPortNumber(serverBean.getPortNumber());
		server.setServerId(serverBean.getServerId());
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
//				bean.setIpAddress(server.getIpAddress());
				bean.setServerType(server.getServerType());
				bean.setPortNumber(server.getPortNumber());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	
	
	
//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//	public ModelAndView addEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
//			BindingResult result) {
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
//		return new ModelAndView("addEmployee", model);
//	}

	
//	@RequestMapping(value="/employees", method = RequestMethod.GET)
//	public ModelAndView listEmployees() {
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
//		return new ModelAndView("employeesList", model);
//	}
	
//	private List<EmployeeBean> prepareListofBean(List<Employee> employees){
//		List<EmployeeBean> beans = null;
//		if(employees != null && !employees.isEmpty()){
//			beans = new ArrayList<EmployeeBean>();
//			EmployeeBean bean = null;
//			for(Employee employee : employees){
//				bean = new EmployeeBean();
//				bean.setName(employee.getEmpName());
//				bean.setId(employee.getEmpId());
//				bean.setAddress(employee.getEmpAddress());
//				bean.setSalary(employee.getSalary());
//				bean.setAge(employee.getEmpAge());
//				beans.add(bean);
//			}
//		}
//		return beans;
//	}
	
}
