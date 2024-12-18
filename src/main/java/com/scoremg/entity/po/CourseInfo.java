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
public class CourseInfo implements Serializable {

	/**
	 * 自增id
	 */
	private Integer courseId;

	/**
	 * 课程名称
	 */
	private String courseName;

	/**
	 * 教师id
	 */
	private String teacherId;

	/**
	 * 课程描述
	 */
	private String description;

	/**
	 * 开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;

	/**
	 * 结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;

	/**
	 * 上课班级
	 */
	private String classRoom;

	/**
	 * 上课方式
	 */
	private Integer teachMethod;

	/**
	 * 最大上课人数
	 */
	private Integer maxEnrollment;

	/**
	 * 考核方式
	 */
	private String assesMethod;

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getClassRoom() {
		return this.classRoom;
	}

	public void setTeachMethod(Integer teachMethod) {
		this.teachMethod = teachMethod;
	}

	public Integer getTeachMethod() {
		return this.teachMethod;
	}

	public void setMaxEnrollment(Integer maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}

	public Integer getMaxEnrollment() {
		return this.maxEnrollment;
	}

	public void setAssesMethod(String assesMethod) {
		this.assesMethod = assesMethod;
	}

	public String getAssesMethod() {
		return this.assesMethod;
	}

	@Override
	public String toString() {
		return "自增id:" + courseId + ",课程名称:" + courseName + ",教师id:" + teacherId + ",课程描述:" + description + ",开始时间:" + startTime + ",结束时间:" + endTime + ",上课班级:" + classRoom + ",上课方式:" + teachMethod + ",最大上课人数:" + maxEnrollment + ",考核方式:" + assesMethod + "";
	}

}