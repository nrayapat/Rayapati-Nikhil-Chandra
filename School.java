package com.capgemini.day6;

import java.util.Objects;

public class School {
private String name;
private String school;
private String district;
private int greatSchoolRanking;
public School() {
	super();
	// TODO Auto-generated constructor stub
}
public School(String name, String school, String district, int greatSchoolRanking) {
	super();
	this.name = name;
	this.school = school;
	this.district = district;
	this.greatSchoolRanking = greatSchoolRanking;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public int getGreatSchoolRanking() {
	return greatSchoolRanking;
}
public void setGreatSchoolRanking(int greatSchoolRanking) {
	this.greatSchoolRanking = greatSchoolRanking;
}
@Override
public String toString() {
	return "School [name=" + name + ", school=" + school + ", district=" + district + ", greatSchoolRanking="
			+ greatSchoolRanking + "]";
}
@Override
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	
	School c2 = (School) obj;
	return this.name == c2.name && this.school == c2.school
				&& this.district == c2.district;
}	

@Override
public int hashCode() {
	return Objects.hash(name,school,district);
}
}











