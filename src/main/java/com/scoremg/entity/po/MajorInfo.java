package com.scoremg.entity.po;

import java.io.Serializable;

/**
 * @Description:
 * @Date:2024-12-18
 * @author：author
*/
public class MajorInfo implements Serializable {

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 部门ID
	 */
	private Integer departmentId;

	/**
	 * 专业名称
	 */
	private String majorName;

	/**
	 * 专业名称
	 */
	private String description;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return "id:" + id + ",部门ID:" + departmentId + ",专业名称:" + majorName + ",专业名称:" + description + "";
	}

}