package com.scoremg.entity.query;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class DepartmentInfoQuery extends BaseQuery{

	/**
	 * 部门id
	 */
	private Integer departmentId;

	/**
	 * 部门名称
	 */
	private String departmentName;

	private String departmentNameFuzzy;

	/**
	 * 部门描述
	 */
	private String description;

	private String descriptionFuzzy;

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

	public void setDepartmentNameFuzzy(String departmentNameFuzzy) {
		this.departmentNameFuzzy = departmentNameFuzzy;
	}

	public String getDepartmentNameFuzzy() {
		return this.departmentNameFuzzy;
	}

	public void setDescriptionFuzzy(String descriptionFuzzy) {
		this.descriptionFuzzy = descriptionFuzzy;
	}

	public String getDescriptionFuzzy() {
		return this.descriptionFuzzy;
	}

}