package com.scoremg.entity.po;

import java.io.Serializable;

/**
 * @Description:
 * @Date:2024-12-18
 * @author：author
*/
public class DepartmentInfo implements Serializable {

	/**
	 * 部门id
	 */
	private Integer departmentId;

	/**
	 * 部门名称
	 */
	private String departmentName;

	/**
	 * 部门描述
	 */
	private String description;

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return "部门id:" + departmentId + ",部门名称:" + departmentName + ",部门描述:" + description + "";
	}

}