package com.cg.entities;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager")
@DiscriminatorValue(value="MGR")
public class Manager extends Employee {
private static final long serialVersionUID=1L;
private String departmentName;
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

}
