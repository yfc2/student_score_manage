package com.scoremg.entity.query;

import java.math.BigDecimal;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class CourseSelectInfoQuery extends BaseQuery{

	/**
	 * 选课id
	 */
	private Integer id;

	/**
	 * 学生id
	 */
	private String studentId;

	private String studentIdFuzzy;

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

	public void setStudentIdFuzzy(String studentIdFuzzy) {
		this.studentIdFuzzy = studentIdFuzzy;
	}

	public String getStudentIdFuzzy() {
		return this.studentIdFuzzy;
	}

}