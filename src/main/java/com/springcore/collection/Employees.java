package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
	
	private String EmpName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employees(String empName, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		EmpName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
