package com.scoremg.entity.po;

import java.io.Serializable;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Description:
 * @Date:2024-12-18
 * @author：author
*/
public class StudentClassInfo implements Serializable {

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 学生id
	 */
	private String studentId;

	/**
	 * 班级Id
	 */
	private Integer classId;

	/**
	 * 加入班级时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date joinTime;

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

	@Override
	public String toString() {
		return "id:" + id + ",学生id:" + studentId + ",班级Id:" + classId + ",加入班级时间:" + joinTime + ",0 :未毕业 1：已经毕业:" + graduated + "";
	}

}