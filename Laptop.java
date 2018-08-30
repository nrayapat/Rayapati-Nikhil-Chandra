package com.capgemini.day6;

import java.util.Objects;

public class Laptop {

	String company ;
	String model ;
	String operatingSystem ;
	String processor ;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Laptop c2 = (Laptop) obj;
		return this.company == c2.company && this.model == c2.model 
					&& this.processor == c2.processor;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(company, model, processor);
	}
}