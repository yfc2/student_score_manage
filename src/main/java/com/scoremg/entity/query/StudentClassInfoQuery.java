package com.scoremg.entity.query;

import java.util.Date;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class StudentClassInfoQuery extends BaseQuery{

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 学生id
	 */
	private String studentId;

	private String studentIdFuzzy;

	/**
	 * 班级Id
	 */
	private Integer classId;

	/**
	 * 加入班级时间
	 */
	private Date joinTime;

	private String joinTimeStart;

	private String joinTimeEnd;

	/**
	 * 0 :未毕业 1：已经毕业
	 */
	private Integer graduated;

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

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public Date getJoinTime() {
		return this.joinTime;
	}

	public void setGraduated(Integer graduated) {
		this.graduated = graduated;
	}

	public Integer getGraduated() {
		return this.graduated;
	}

	public void setStudentIdFuzzy(String studentIdFuzzy) {
		this.studentIdFuzzy = studentIdFuzzy;
	}

	public String getStudentIdFuzzy() {
		return this.studentIdFuzzy;
	}

	public void setJoinTimeStart(String joinTimeStart) {
		this.joinTimeStart = joinTimeStart;
	}

	public String getJoinTimeStart() {
		return this.joinTimeStart;
	}

	public void setJoinTimeEnd(String joinTimeEnd) {
		this.joinTimeEnd = joinTimeEnd;
	}

	public String getJoinTimeEnd() {
		return this.joinTimeEnd;
	}

}