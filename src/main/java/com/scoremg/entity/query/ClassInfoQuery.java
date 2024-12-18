package com.scoremg.entity.query;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class ClassInfoQuery extends BaseQuery{

	/**
	 * 班级Id
	 */
	private Integer classId;

	/**
	 * 专业id
	 */
	private Integer majorId;

	/**
	 * 班级名称
	 */
	private String className;

	private String classNameFuzzy;

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public Integer getMajorId() {
		return this.majorId;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassNameFuzzy(String classNameFuzzy) {
		this.classNameFuzzy = classNameFuzzy;
	}

	public String getClassNameFuzzy() {
		return this.classNameFuzzy;
	}

}