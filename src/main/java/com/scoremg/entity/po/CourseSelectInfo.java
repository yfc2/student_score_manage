package com.scoremg.entity.po;

import java.io.Serializable;

import java.math.BigDecimal;

/**
 * @Description:
 * @Date:2024-12-18
 * @author：author
*/
public class CourseSelectInfo implements Serializable {

	/**
	 * 选课id
	 */
	private Integer id;

	/**
	 * 学生id
	 */
	private String studentId;

	/**
	 * 课程id
	 */
	private Integer courseId;

	/**
	 * 成绩
	 */
	private BigDecimal grade;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

	public BigDecimal getGrade() {
		return this.grade;
	}

	@Override
	public String toString() {
		return "选课id:" + id + ",学生id:" + studentId + ",课程id:" + courseId + ",成绩:" + grade + "";
	}

}