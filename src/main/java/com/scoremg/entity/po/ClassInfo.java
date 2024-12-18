package com.scoremg.entity.po;

import java.io.Serializable;

/**
 * @Description:
 * @Date:2024-12-18
 * @author：author
*/
public class ClassInfo implements Serializable {

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

	@Override
	public String toString() {
		return "班级Id:" + classId + ",专业id:" + majorId + ",班级名称:" + className + "";
	}

}