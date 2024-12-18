package com.scoremg.entity.query;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class MajorInfoQuery extends BaseQuery{

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

	private String majorNameFuzzy;

	/**
	 * 专业名称
	 */
	private String description;

	private String descriptionFuzzy;

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

	public void setMajorNameFuzzy(String majorNameFuzzy) {
		this.majorNameFuzzy = majorNameFuzzy;
	}

	public String getMajorNameFuzzy() {
		return this.majorNameFuzzy;
	}

	public void setDescriptionFuzzy(String descriptionFuzzy) {
		this.descriptionFuzzy = descriptionFuzzy;
	}

	public String getDescriptionFuzzy() {
		return this.descriptionFuzzy;
	}

}